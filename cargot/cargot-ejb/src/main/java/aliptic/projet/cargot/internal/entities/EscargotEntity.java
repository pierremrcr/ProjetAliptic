package aliptic.projet.cargot.internal.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class EscargotEntity {

	@Id
	private int id;
	private boolean isDisponible;
	private Calibre calibre;

	public abstract String getEspece();
	
	public EscargotEntity(int id, boolean isDisponible, Calibre calibre) {
		this.id = id;
		this.isDisponible = isDisponible;
		this.calibre = calibre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDisponible() {
		return isDisponible;
	}

	public void setDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}

	public Calibre getCalibre() {
		return calibre;
	}

	public void setCalibre(Calibre calibre) {
		this.calibre = calibre;
	}

}
