package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.daos.EscargotDAO;
import aliptic.projet.cargot.internal.entities.EscargotEntity;
import aliptic.projet.cargot.pub.services.EscargotServiceRemote;

@Stateless
public class EscargotService implements EscargotServiceRemote {
	
	@EJB
	EscargotDAO escargotDAO;

	@Override
	public void createEscargot(int id, boolean isDisponible, Calibre calibre, Espece espece, double poids) {
		escargotDAO.createEscargot(id, isDisponible, calibre, espece, poids);
		
	}
	
	@Override
	public EscargotEntity getEscargotById(int id) {
		EscargotEntity escargot = escargotDAO.getEscargotById(id);
		return escargot;
	}

	@Override
	public List<EscargotEntity> getAllEscargots() {
		List<EscargotEntity> escargots = escargotDAO.getAllEscargot();
		return escargots;
	}


	@Override
	public void deleteEscargotById(int id) {
		escargotDAO.deleteEscargotById(id);	
	}

	@Override
	public void updateEscargot(int id, boolean isDisponible, Calibre calibre, Espece espece, double poids) {
		EscargotEntity escargot = escargotDAO.getEscargotById(id);
		escargot.setCalibre(calibre);
		escargot.setDisponible(isDisponible);
		escargot.setEspece(espece);
		escargot.setPoids(poids);
		escargotDAO.modifierEscargot(escargot);	
	}

	@Override
	public void deleteEscargot(EscargotEntity escargot) {
		// TODO Auto-generated method stub
		
	}

}
