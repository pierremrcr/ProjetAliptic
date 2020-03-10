package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;
import aliptic.projet.cargot.pub.dtos.AdresseDTO;

@Remote
public interface AdresseServiceRemote {
	
	public void createAdresse(AdresseDTO Adresse);
	public AdresseDTO readAdresse(int id);
	public List<AdresseDTO> readAdresses();
	public void updateAdresse(AdresseDTO Adresse);
	public void deleteAdresse(AdresseDTO Adresse);
	public void deleteAdresseFromId(int id);

}
