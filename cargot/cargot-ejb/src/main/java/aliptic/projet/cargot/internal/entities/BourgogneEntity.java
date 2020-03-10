package aliptic.projet.cargot.internal.entities;

public class BourgogneEntity extends EscargotEntity {

	public BourgogneEntity(int id, boolean isDisponible, Calibre calibre) {
		super(id, isDisponible, calibre);
	}

	public String getEspece() {
		return "bourgogne";
	}

}
