package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.CartonDTO;
import aliptic.projet.cargot.internal.daos.CartonDAO;
import aliptic.projet.cargot.pub.services.CartonServiceRemote;

@Stateless
public class CartonService implements CartonServiceRemote {
	
	@EJB
	CartonDAO CartonDAO;

	@Override
	public void createCarton(CartonDTO Carton) {
		// TODO Auto-generated method stub

	}

	@Override
	public CartonDTO readCarton(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartonDTO> readCartons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCarton(CartonDTO Carton) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCarton(CartonDTO Carton) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCartonFromId(int id) {
		// TODO Auto-generated method stub

	}

}
