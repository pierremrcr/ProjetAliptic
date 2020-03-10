package aliptic.projet.cargot.pub.dtos;

import java.io.Serializable;
import java.util.List;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.pub.dtos.EscargotDTO;

public class VerrineDTO implements Serializable {
	
	private int id;
	private Calibre calibre;
	private Espece espece;
	private int quantiteMax;
	private List<EscargotDTO> escargots;
	
	public VerrineDTO(int id, Calibre calibre, Espece espece, int quantiteMax, List<EscargotDTO> escargots) {
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
	
	public List<EscargotDTO> getEscargots() {
		return escargots;
	}
	
	public void setEscargots(List<EscargotDTO> escargots) {
		this.escargots = escargots;
	}
	
	public double getPoids() {
		return escargots.get(0).getPoids() * escargots.size();
	}

}
