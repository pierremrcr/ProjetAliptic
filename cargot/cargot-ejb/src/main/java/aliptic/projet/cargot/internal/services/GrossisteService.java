package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.GrossisteDTO;
import aliptic.projet.cargot.internal.daos.GrossisteDAO;
import aliptic.projet.cargot.pub.services.GrossisteServiceRemote;

@Stateless
public class GrossisteService implements GrossisteServiceRemote {
	
	@EJB
	GrossisteDAO GrossisteDAO;

	@Override
	public void createGrossiste(GrossisteDTO Grossiste) {
		// TODO Auto-generated method stub

	}

	@Override
	public GrossisteDTO readGrossiste(int numeroSIRET) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrossisteDTO> readGrossistes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGrossiste(GrossisteDTO Grossiste) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGrossiste(GrossisteDTO Grossiste) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGrossisteFromNumeroSIRET(int numeroSIRET) {
		// TODO Auto-generated method stub

	}

}
