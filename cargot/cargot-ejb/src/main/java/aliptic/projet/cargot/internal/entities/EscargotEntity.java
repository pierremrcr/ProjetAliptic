package aliptic.projet.cargot.internal.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;

@SuppressWarnings("serial")
@Entity
public class EscargotEntity implements Serializable{

	@Id
	private int id;
	private boolean isDisponible;
	public Calibre calibre;
	public Espece espece;
	private double poids;

	public EscargotEntity() {
		super();
	}

	public EscargotEntity(int id, boolean isDisponible, Calibre calibre, Espece espece, double poids) {
		this.id = id;
		this.isDisponible = isDisponible;
		this.calibre = calibre;
		this.espece = espece;
		this.poids = poids;
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
	
	public Espece getEspece() {
		return espece;
	}

	public void setEspece(Espece espece) {
		this.espece = espece;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

}
