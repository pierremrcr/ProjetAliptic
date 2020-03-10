package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import aliptic.projet.cargot.internal.entities.GrossisteEntity;

@Stateless
@Local
public class GrossisteDAO {
	
	@PersistenceContext(unitName="A_MODIFIER")
	EntityManager entityManager;

	public void create(GrossisteEntity Grossiste) {
		entityManager.persist(Grossiste);
	}

	public GrossisteEntity readOne(int numeroSIRET) {
		return entityManager.find(GrossisteEntity.class, numeroSIRET);
	}
	
	public List<GrossisteEntity> readAll() {
		return entityManager.createQuery("from GrossisteEntity").getResultList();
	}

	public void update(GrossisteEntity Grossiste) {
		entityManager.persist(Grossiste);
	}

	public void delete(GrossisteEntity Grossiste) {
		entityManager.remove(Grossiste);
	}

}
