package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;
import aliptic.projet.cargot.internal.daos.VerrineDAO;
import aliptic.projet.cargot.pub.services.VerrineServiceRemote;

@Stateless
public class VerrineService implements VerrineServiceRemote {
	
	@EJB
	VerrineDAO VerrineDAO;

	@Override
	public void createVerrine(VerrineDTO Verrine) {
		// TODO Auto-generated method stub

	}

	@Override
	public VerrineDTO readVerrine(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VerrineDTO> readVerrines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateVerrine(VerrineDTO Verrine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteVerrine(VerrineDTO Verrine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteVerrineFromId(int id) {
		// TODO Auto-generated method stub

	}

}
