package aliptic.projet.cargot.internal.services;

import java.util.ArrayList;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.daos.VerrineDAO;
import aliptic.projet.cargot.internal.entities.EscargotEntity;
import aliptic.projet.cargot.internal.entities.VerrineEntity;
import aliptic.projet.cargot.internal.utils.VerrineConverter;
import aliptic.projet.cargot.pub.services.VerrineServiceRemote;

@Stateless
public class VerrineService implements VerrineServiceRemote {
	
	@EJB
	VerrineDAO verrineDAO;
	
	@EJB
	EscargotService escargotService;

	@Override
	public void createVerrine(Calibre calibre, Espece espece, int quantiteMax) {
		List<EscargotEntity> escargots = new ArrayList<EscargotEntity>();
		List<EscargotEntity> toVerrine = new ArrayList<EscargotEntity>();
		escargots = escargotService.getAllEscargots();
		for(EscargotEntity escargot : escargots) {
			if(escargot.getCalibre()==calibre&&escargot.getEspece()==espece&&escargot.isDisponible()==true) {
				if(toVerrine.size()<quantiteMax) {toVerrine.add(escargot);}
			}
		}
		verrineDAO.create(calibre, espece, quantiteMax,toVerrine);	
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
