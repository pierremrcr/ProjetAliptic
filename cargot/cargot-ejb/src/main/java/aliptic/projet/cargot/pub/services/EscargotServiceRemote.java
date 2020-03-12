package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;

import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.entities.EscargotEntity;

@Remote
public interface EscargotServiceRemote {
	
	public void createEscargot(int id, boolean isDisponible, Calibre calibre, Espece espece, double poids);
	public EscargotEntity getEscargotById(int id);
	public List<EscargotEntity> getAllEscargots();
	public void updateEscargot(int id, boolean isDisponible, Calibre calibre, Espece espece, double poids);
	public void deleteEscargot(EscargotEntity escargot);
	public void deleteEscargotById(int id);

}
