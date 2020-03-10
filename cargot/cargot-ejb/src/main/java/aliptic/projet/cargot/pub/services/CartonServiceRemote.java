package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;
import aliptic.projet.cargot.pub.dtos.CartonDTO;

@Remote
public interface CartonServiceRemote {
	
	public void createCarton(CartonDTO Carton);
	public CartonDTO readCarton(int id);
	public List<CartonDTO> readCartons();
	public void updateCarton(CartonDTO Carton);
	public void deleteCarton(CartonDTO Carton);
	public void deleteCartonFromId(int id);

}
