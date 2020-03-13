package aliptic.projet.cargot.internal.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;

@SuppressWarnings("serial")
@Entity
public class EscargotEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
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

	public void setEspece(Espece espece) {
		this.espece = espece;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EscargotEntity other = (EscargotEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
