package aliptic.projet.cargot.internal.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;

@Entity
public class VerrineEntity {
	
	@Id
	private int id;
	private Calibre calibre;
	private Espece espece;
	private int quantiteMax;
	
	@OneToMany(mappedBy="verrine")
	private List<EscargotEntity> escargots;
	
	
	public VerrineEntity() {
		super();
	}

	public VerrineEntity(Calibre calibre, Espece espece, int quantiteMax, List<EscargotEntity> escargots) {
		this.calibre = calibre;
		this.espece = espece;
		this.quantiteMax = quantiteMax;
		this.escargots = escargots;
	}
	
	public VerrineEntity(Calibre calibre, Espece espece, int quantiteMax) {
		super();
		this.calibre = calibre;
		this.espece = espece;
		this.quantiteMax = quantiteMax;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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

	public int getQuantiteMax() {
		return quantiteMax;
	}

	public void setQuantiteMax(int quantiteMax) {
		this.quantiteMax = quantiteMax;
	}
	
	
	public List<EscargotEntity> getEscargots() {
		return escargots;
	}
	
	public void setEscargots(List<EscargotEntity> escargots) {
		this.escargots = escargots;
	}
	
	public double getPoids() {
		return escargots.get(0).getPoids() * escargots.size();
	}
	
	

}
