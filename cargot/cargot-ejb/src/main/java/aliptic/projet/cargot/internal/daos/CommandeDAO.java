package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import aliptic.projet.cargot.internal.entities.CommandeEntity;

@Stateless
@Local
public class CommandeDAO {
	
	@PersistenceContext(unitName="cargotPersistenceUnit")
	EntityManager entityManager;
	
	public void create(CommandeEntity Commande) {
		entityManager.persist(Commande);
	}
	
	public CommandeEntity readOne(int numeroCommande) {
		return entityManager.find(CommandeEntity.class, numeroCommande);
	}
	
	public List<CommandeEntity> readAll() {
		return entityManager.createQuery("from CommandeEntity").getResultList();
	}
	
	public void update(CommandeEntity Commande) {
		entityManager.persist(Commande);
	}
	
	public void delete(CommandeEntity Commande) {
		entityManager.remove(Commande);
	}

}
