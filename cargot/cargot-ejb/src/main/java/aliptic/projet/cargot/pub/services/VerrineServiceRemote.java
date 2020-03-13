package aliptic.projet.cargot.pub.services;

import java.util.List;

import javax.ejb.ObjectNotFoundException;
import javax.ejb.Remote;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;

@Remote
public interface VerrineServiceRemote {
	
	public void createVerrine(Calibre calibre, Espece espece, int quantiteMax) throws ObjectNotFoundException;
	public VerrineDTO getVerrineById(int id);
	public List<VerrineDTO> getAllVerrines();
	public void updateVerrine(int id, Calibre calibre, Espece espece, int quantiteMax);
	public void deleteVerrineById(int id);

}
