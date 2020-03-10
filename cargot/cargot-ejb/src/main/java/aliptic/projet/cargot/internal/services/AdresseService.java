package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.AdresseDTO;
import aliptic.projet.cargot.internal.daos.AdresseDAO;
import aliptic.projet.cargot.pub.services.AdresseServiceRemote;

@Stateless
public class AdresseService implements AdresseServiceRemote {
	
	@EJB
	AdresseDAO AdresseDAO;

	@Override
	public void createAdresse(AdresseDTO Adresse) {
		// TODO Auto-generated method stub

	}

	@Override
	public AdresseDTO readAdresse(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdresseDTO> readAdresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdresse(AdresseDTO Adresse) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAdresse(AdresseDTO Adresse) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAdresseFromId(int id) {
		// TODO Auto-generated method stub

	}

}
