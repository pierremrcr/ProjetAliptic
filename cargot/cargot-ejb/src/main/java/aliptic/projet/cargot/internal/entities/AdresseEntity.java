package aliptic.projet.cargot.internal.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdresseEntity {
	
	@Id
	private int id;
	private String numero;
	private String nomRue;
	private String codePostal;
	private String ville;
	private String pays;
	
	public AdresseEntity(int id, String numero, String nomRue, String codePostal, String ville, String pays) {
		super();
		this.id = id;
		this.numero = numero;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}
