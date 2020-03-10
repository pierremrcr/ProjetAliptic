package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.EscargotDTO;
import aliptic.projet.cargot.internal.daos.EscargotDAO;
import aliptic.projet.cargot.pub.services.EscargotServiceRemote;

@Stateless
public class EscargotService implements EscargotServiceRemote {
	
	@EJB
	EscargotDAO EscargotDAO;

	@Override
	public void createEscargot(EscargotDTO escargot) {
		// TODO Auto-generated method stub

	}

	@Override
	public EscargotDTO readEscargot(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EscargotDTO> readEscargots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEscargot(EscargotDTO escargot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEscargot(EscargotDTO escargot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEscargotFromId(int id) {
		// TODO Auto-generated method stub

	}

}
