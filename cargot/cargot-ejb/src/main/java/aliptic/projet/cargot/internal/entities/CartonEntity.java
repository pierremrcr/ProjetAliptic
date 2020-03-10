package aliptic.projet.cargot.internal.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;


public class CartonEntity {
	
	@Id
	private int id;
	private List<VerrineEntity> verrines;
	
	public CartonEntity(int id, List<VerrineEntity> verrines) {
		this.id = id;
		this.verrines = verrines;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<VerrineEntity> getVerrines() {
		return verrines;
	}
	
	public void setVerrines(List<VerrineEntity> verrines) {
		this.verrines = verrines;
	}
	
	public double getPoids() {
		double total = 0.;
		for (VerrineEntity verrine: verrines) {
			total += verrine.getPoids();
		}
		return total;
	}

}
