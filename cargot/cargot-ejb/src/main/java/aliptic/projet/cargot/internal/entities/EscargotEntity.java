package aliptic.projet.cargot.internal.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;

@SuppressWarnings("serial")
@Entity
public class EscargotEntity implements Serializable{

	@Id
	private Integer id;
	private Boolean isDisponible;
	private Calibre calibre;
	private Espece espece;
	private Double poids;
	
	@ManyToOne
	@JoinColumn(name="verrineid")
	private VerrineEntity verrine;

	public EscargotEntity() {
		super();
	}

	public EscargotEntity(boolean isDisponible, Calibre calibre, Espece espece, double poids) {
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

	public VerrineEntity getVerrine() {
		return verrine;
	}

	public void setVerrine(VerrineEntity verrine) {
		this.verrine = verrine;
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
