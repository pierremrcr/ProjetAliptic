package aliptic.projet.cargot.internal.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VerrineEntity {
	
	@Id
	private int id;
	private Calibre calibre;
	private Espece espece;
	private int quantiteMax;
	private List<EscargotEntity> escargots;
	
	public VerrineEntity(int id, Calibre calibre, Espece espece, int quantiteMax, List<EscargotEntity> escargots) {
		this.id = id;
		this.calibre = calibre;
		this.espece = espece;
		this.quantiteMax = quantiteMax;
		this.escargots = escargots;
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
