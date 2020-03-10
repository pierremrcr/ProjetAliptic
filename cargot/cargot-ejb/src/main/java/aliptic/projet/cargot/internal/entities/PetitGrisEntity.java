package aliptic.projet.cargot.internal.entities;

import javax.persistence.Entity;

@Entity
public class PetitGrisEntity extends EscargotEntity {

	public PetitGrisEntity(int id, boolean isDisponible, Calibre calibre) {
		super(id, isDisponible, calibre);
	}

	public String getEspece() {
		return "petit gris";
	}

}