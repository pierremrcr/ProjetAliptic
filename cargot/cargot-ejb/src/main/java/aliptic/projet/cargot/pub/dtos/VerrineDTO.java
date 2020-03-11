package aliptic.projet.cargot.pub.dtos;

import java.io.Serializable;
import java.util.List;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.pub.dtos.EscargotDTO;

public class VerrineDTO implements Serializable {
	
	private int id;
	private String calibre;
	private String espece;
	private int quantite;
	private double poids;
	
	public VerrineDTO(int id, String calibre, String espece, int quantite, double poids) {
		this.id = id;
		this.calibre = calibre;
		this.espece = espece;
		this.quantite = quantite;
		this.poids = poids;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}

}
