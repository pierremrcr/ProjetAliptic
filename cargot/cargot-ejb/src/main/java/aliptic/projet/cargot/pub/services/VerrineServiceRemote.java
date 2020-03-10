package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;

@Remote
public interface VerrineServiceRemote {
	
	public void createVerrine(VerrineDTO Verrine);
	public VerrineDTO readVerrine(int id);
	public List<VerrineDTO> readVerrines();
	public void updateVerrine(VerrineDTO Verrine);
	public void deleteVerrine(VerrineDTO Verrine);
	public void deleteVerrineFromId(int id);

}
