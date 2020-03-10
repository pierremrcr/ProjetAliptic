package aliptic.projet.cargot.internal.entities;

import java.util.ArrayList;
import java.util.List;

public class CartonEntity {
	
	private int id;
	private List<VerrineEntity> verrines;
	
	public CartonEntity(int id) {
		super();
		this.id = id;
		verrines = new ArrayList<VerrineEntity>();
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
