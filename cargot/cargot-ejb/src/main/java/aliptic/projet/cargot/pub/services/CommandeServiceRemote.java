package aliptic.projet.cargot.pub.services;

import java.util.List;
import javax.ejb.Remote;
import aliptic.projet.cargot.pub.dtos.CommandeDTO;

@Remote
public interface CommandeServiceRemote {
	
	public void createCommande(CommandeDTO Commande);
	public CommandeDTO readCommande(int id);
	public List<CommandeDTO> readCommandes();
	public void updateCommande(CommandeDTO Commande);
	public void deleteCommande(CommandeDTO Commande);
	public void deleteCommandeFromId(int id);

}
