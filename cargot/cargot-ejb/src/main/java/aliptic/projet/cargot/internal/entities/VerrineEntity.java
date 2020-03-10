package aliptic.projet.cargot.internal.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VerrineEntity {
	
	@Id
	private int id;
	private List<EscargotEntity> escargots;
	
	public VerrineEntity(int id, List<EscargotEntity> escargots) {
		this.id = id;
		escargots = this.escargots;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<EscargotEntity> getEscargots() {
		return escargots;
	}
	
	public void setEscargots(List<EscargotEntity> escargots) {
		this.escargots = escargots;
	}
	
	public double getPoids() {
		double poidsEscargot = 0.;
		switch (escargots.get(0).getCalibre()) {
			case PETIT:
				poidsEscargot = 5.;
			case MOYEN:
				poidsEscargot = 10.;
			case GRAND:
				poidsEscargot = 20.;
		}
		return escargots.size() * poidsEscargot;
	}

}
