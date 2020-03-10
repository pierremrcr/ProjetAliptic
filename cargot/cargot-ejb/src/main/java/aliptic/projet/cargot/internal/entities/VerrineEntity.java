package aliptic.projet.cargot.internal.entities;

import java.util.ArrayList;
import java.util.List;

public class VerrineEntity {
	
	private int id;
	private List<EscargotEntity> escargots;
	private Calibre calibre;
	
	public VerrineEntity(int id, Calibre calibre) {
		super();
		this.id = id;
		this.calibre = calibre;
		escargots = new ArrayList<EscargotEntity>();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<EscargotEntity> getEscargots() {
		return escargots;
	}
	
	public void setEscargots(List<EscargotEntity> escargots) {
		this.escargots = escargots;
	}
	
	public Calibre getCalibre() {
		return calibre;
	}
	
	public void setCalibre(Calibre calibre) {
		this.calibre = calibre;
	}
	
	public double getPoids() {
		double poidsEscargot = 0.;
		switch (calibre) {
			case PETIT:
				poidsEscargot = 5.;
			case MOYEN:
				poidsEscargot = 10.;
			case GRAND:
				poidsEscargot = 20.;
		}
		return escargots.size() * poidsEscargot;
	}

}
