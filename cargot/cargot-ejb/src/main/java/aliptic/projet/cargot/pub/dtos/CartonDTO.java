package aliptic.projet.cargot.pub.dtos;

import java.io.Serializable;
import java.util.List;
import aliptic.projet.cargot.pub.dtos.VerrineDTO;

public class CartonDTO implements Serializable {
	
	private int id;
	private List<VerrineDTO> verrines;
	
	public CartonDTO(int id, List<VerrineDTO> verrines) {
		this.id = id;
		this.verrines = verrines;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<VerrineDTO> getVerrines() {
		return verrines;
	}
	
	public void setVerrines(List<VerrineDTO> verrines) {
		this.verrines = verrines;
	}
	
	/*
	
	public double getPoids() {
		double total = 0.;
		for (VerrineDTO verrine: verrines) {
			total += verrine.getPoids();
		}
		return total;
	}
	
	*/

}
