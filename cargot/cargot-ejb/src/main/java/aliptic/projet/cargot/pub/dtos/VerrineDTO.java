package aliptic.projet.cargot.pub.dtos;

import java.io.Serializable;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;

public class VerrineDTO implements Serializable {
	
	private int id;
	private Calibre calibre;
	private Espece espece;
	private int quantite;
	
	public VerrineDTO(int id, Calibre calibre, Espece espece, int quantite) {
		this.id = id;
		this.calibre = calibre;
		this.espece = espece;
		this.quantite = quantite;
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

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
