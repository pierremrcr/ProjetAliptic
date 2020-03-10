package aliptic.projet.cargot.internal.entities;

import javax.persistence.Entity;

@Entity
public class BourgogneEntity extends EscargotEntity {

	public BourgogneEntity(int id, boolean isDisponible, Calibre calibre) {
		super(id, isDisponible, calibre);
	}

	public String getEspece() {
		return "bourgogne";
	}

}
