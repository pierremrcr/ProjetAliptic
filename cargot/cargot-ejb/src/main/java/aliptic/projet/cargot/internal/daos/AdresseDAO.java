package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import aliptic.projet.cargot.internal.entities.AdresseEntity;

@Stateless
@Local
public class AdresseDAO {
	
	@PersistenceContext(unitName="A_MODIFIER")
	EntityManager entityManager;

	public void create(AdresseEntity Adresse) {
		entityManager.persist(Adresse);
	}

	public AdresseEntity readOne(int id) {
		return entityManager.find(AdresseEntity.class, id);
	}
	
	public List<AdresseEntity> readAll() {
		return entityManager.createQuery("from AdresseEntity").getResultList();
	}

	public void update(AdresseEntity Adresse) {
		entityManager.persist(Adresse);
	}

	public void delete(AdresseEntity Adresse) {
		entityManager.remove(Adresse);
	}

}
