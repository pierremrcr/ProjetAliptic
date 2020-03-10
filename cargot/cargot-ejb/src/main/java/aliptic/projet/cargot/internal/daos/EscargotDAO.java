package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import aliptic.projet.cargot.internal.entities.EscargotEntity;

@Stateless
@Local
public class EscargotDAO {
	
	@PersistenceContext(unitName="cargotPersistenceUnit")
	EntityManager entityManager;

	public void create(EscargotEntity Escargot) {
		entityManager.persist(Escargot);
	}

	public EscargotEntity readOne(int id) {
		return entityManager.find(EscargotEntity.class, id);
	}
	
	public List<EscargotEntity> readAll() {
		return entityManager.createQuery("from EscargotEntity").getResultList();
	}

	public void update(EscargotEntity Escargot) {
		entityManager.persist(Escargot);
	}

	public void delete(EscargotEntity Escargot) {
		entityManager.remove(Escargot);
	}

}
