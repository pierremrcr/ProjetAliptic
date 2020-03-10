package aliptic.projet.cargot.internal.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import aliptic.projet.cargot.pub.dtos.CommandeDTO;
import aliptic.projet.cargot.internal.daos.CommandeDAO;
import aliptic.projet.cargot.pub.services.CommandeServiceRemote;

@Stateless
public class CommandeService implements CommandeServiceRemote {
	
	@EJB
	CommandeDAO CommandeDAO;

	@Override
	public void createCommande(CommandeDTO Commande) {
		// TODO Auto-generated method stub

	}

	@Override
	public CommandeDTO readCommande(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeDTO> readCommandes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCommande(CommandeDTO Commande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCommande(CommandeDTO Commande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCommandeFromId(int id) {
		// TODO Auto-generated method stub

	}

}
