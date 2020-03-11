package aliptic.projet.cargot.pub.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import aliptic.projet.cargot.internal.Calibre;

public class CommandeDTO implements Serializable {
	
	private int numeroCommande;
	private List<CartonDTO> cartons;
	
	public CommandeDTO(int numeroCommande) {
		this.setNumeroCommande(numeroCommande);
		cartons = new ArrayList<CartonDTO>();
	}

	public int getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(int numeroCommande) {
		this.numeroCommande = numeroCommande;
	}
	
	private double getRemiseQuantite() {
		return 0.;
	}
	
	private double getRemiseTransport() {
		return 0.;
	}
	
	/*
	public double getTotal() {
		double total = 0;
		for (CartonDTO carton: cartons) {
			List<VerrineDTO> verrines = carton.getVerrines();
			for (VerrineDTO verrine: verrines) {
				Calibre calibre = verrine.getCalibre();
				double prixEscargot = 0.;
				switch (calibre) {
					case PETIT:
						prixEscargot = 1.;
					case MOYEN:
						prixEscargot = 2.;
					case GRAND:
						prixEscargot = 5.;
				}
				total += prixEscargot * verrine.getEscargots().size();
			}
		}
		total -= total * (getRemiseQuantite() + getRemiseTransport());
		return total;
	}
	*/

}
