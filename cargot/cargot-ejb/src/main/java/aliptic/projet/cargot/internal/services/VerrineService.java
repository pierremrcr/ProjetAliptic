package aliptic.projet.cargot.internal.services;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.ObjectNotFoundException;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.daos.VerrineDAO;
import aliptic.projet.cargot.internal.entities.EscargotEntity;
import aliptic.projet.cargot.internal.entities.VerrineEntity;
import aliptic.projet.cargot.internal.utils.VerrineConverter;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;
import aliptic.projet.cargot.pub.services.EscargotServiceRemote;
import aliptic.projet.cargot.pub.services.VerrineServiceRemote;

@Stateless
public class VerrineService implements VerrineServiceRemote {

	@EJB
	VerrineDAO verrineDAO;

	@EJB
	EscargotServiceRemote escargotService;
	
	
	@Override
	public void createVerrine(Calibre calibre, Espece espece, int quantiteMax) throws ObjectNotFoundException {
		List<EscargotEntity> escargots = new ArrayList<EscargotEntity>();
		List<EscargotEntity> toVerrine = new ArrayList<EscargotEntity>();
		escargots = escargotService.getAllEscargots();
		int compteur = 0;

		//Tri des escargots pour remplir la verrine
		for(EscargotEntity escargot : escargots) {
			if(escargot.getCalibre() == calibre && escargot.getEspece() == espece && escargot.isDisponible()==true) {
				compteur++;
				if(compteur<=quantiteMax) {
					toVerrine.add(escargot);
					escargot.getVerrine();
					escargot.getVerrineid();
				}
				else if(compteur==quantiteMax) {
					break;
				}
				else {
					throw new ObjectNotFoundException();	
				}
			}
		}
	
		//Création de la verrine avec la liste d'escargots triés
		VerrineEntity verrine = new VerrineEntity();
		verrine.setCalibre(calibre);
		verrine.setEspece(espece);
		verrine.setQuantiteMax(quantiteMax);
		verrine.setEscargots(toVerrine);
		//verrineDAO.create(calibre, espece, quantiteMax,toVerrine);
		verrineDAO.create(verrine);
		verrine.getId();
			
	}
	
	
	@Override
	public VerrineDTO getVerrineById(int id) {
		VerrineEntity verrine = verrineDAO.getVerrineById(id);
		VerrineDTO verrineDTO = VerrineConverter.entityToDTO(verrine);
		return verrineDTO;
	}

	@Override
	public List<VerrineDTO> getAllVerrines() {
		List<VerrineEntity> verrinesEntity = verrineDAO.getAllVerrines();
		List<VerrineDTO> verrinesDTO = new ArrayList<VerrineDTO>();
		for (VerrineEntity verrineEntity: verrinesEntity) {
			verrinesDTO.add(VerrineConverter.entityToDTO(verrineEntity));
		}
		return verrinesDTO;
	}

	@Override
	public void updateVerrine(int id, Calibre calibre, Espece espece, int quantiteMax) {
		VerrineEntity verrine = verrineDAO.getVerrineById(id);
		verrine.setCalibre(calibre);
		verrine.setEspece(espece);
		verrine.setQuantiteMax(quantiteMax);
		verrineDAO.update(verrine);
	}

	@Override
	public void deleteVerrineById(int id) {
		verrineDAO.deleteVerrineById(id);
	}	
}