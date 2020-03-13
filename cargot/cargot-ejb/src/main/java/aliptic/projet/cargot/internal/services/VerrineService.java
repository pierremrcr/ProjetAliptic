package aliptic.projet.cargot.internal.services;

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

	@Override
	public void createVerrine(int id, Calibre calibre, Espece espece, int quantiteMax) {
		//create list and add escargots to list
		//si escargots non dispo, exception (pub)
		verrineDAO.create(id, calibre, espece, quantiteMax);
		
	}
	
	@Override
	public VerrineDTO getVerrineById(int id) {
		VerrineEntity verrine = verrineDAO.getVerrineById(id);
		VerrineDTO verrineDTO = VerrineConverter.entityToDTO(verrine);
		return verrineDTO;
	}

	@Override
	public List<VerrineDTO> getAllVerrines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateVerrine(int id, Calibre calibre, Espece espece, int quantiteMax) {
		VerrineEntity verrine = verrineDAO.getVerrineById(id);
		verrine.setCalibre(calibre);
		verrine.setEspece(espece);
		verrine.setQuantiteMax(quantiteMax);
		//verrine.setEscargots(escargots);
		verrineDAO.update(verrine);
	}

	@Override
	public void deleteVerrineById(int id) {
		verrineDAO.deleteVerrineById(id);
	}
	
}
