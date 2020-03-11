package aliptic.projet.cargot.internal.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

import aliptic.projet.cargot.internal.Calibre;

@Entity
public class CommandeEntity {
	
	@Id
	private int numeroCommande;
	
	
	public CommandeEntity(int numeroCommande) {
		this.numeroCommande = numeroCommande;
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
		for (CartonEntity carton: cartons) {
			List<VerrineEntity> verrines = carton.getVerrines();
			for (VerrineEntity verrine: verrines) {
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
