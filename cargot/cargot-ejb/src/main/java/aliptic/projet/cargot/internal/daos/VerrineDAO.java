package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import aliptic.projet.cargot.internal.entities.VerrineEntity;

@Stateless
@Local
public class VerrineDAO {
	
	@PersistenceContext(unitName="cargotPersistenceUnit")
	EntityManager entityManager;

	public void create(VerrineEntity Verrine) {
		entityManager.persist(Verrine);
	}

	public VerrineEntity readOne(int id) {
		return entityManager.find(VerrineEntity.class, id);
	}
	
	public List<VerrineEntity> readAll() {
		return entityManager.createQuery("from VerrineEntity").getResultList();
	}

	public void update(VerrineEntity Verrine) {
		entityManager.persist(Verrine);
	}

	public void delete(VerrineEntity Verrine) {
		entityManager.remove(Verrine);
	}

}
