package aliptic.projet.cargot.internal.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrossisteEntity {
	
	@Id
	private int numeroSIRET;
	private String libelle;
	private String email;
	private int numeroTelephone;
	private double tauxPreferentiel;
	private List<AdresseEntity> adresses;

	public GrossisteEntity(int numeroSIRET, String libelle, String email, int numeroTelephone,
			double tauxPreferentiel) {
		super();
		this.numeroSIRET = numeroSIRET;
		this.libelle = libelle;
		this.email = email;
		this.numeroTelephone = numeroTelephone;
		this.tauxPreferentiel = tauxPreferentiel;
		adresses = new ArrayList<AdresseEntity>();
	}
	
	public int getNumeroSIRET() {
		return numeroSIRET;
	}

	public void setNumeroSIRET(int numeroSIRET) {
		this.numeroSIRET = numeroSIRET;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public double getTauxPreferentiel() {
		return tauxPreferentiel;
	}

	public void setTauxPreferentiel(double tauxPreferentiel) {
		this.tauxPreferentiel = tauxPreferentiel;
	}

	public List<AdresseEntity> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<AdresseEntity> adresses) {
		this.adresses = adresses;
	}

}
