package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import aliptic.projet.cargot.internal.entities.CartonEntity;

@Stateless
@Local
public class CartonDAO {
	
	@PersistenceContext(unitName="cargotPersistenceUnit")
	EntityManager entityManager;

	public void create(CartonEntity Carton) {
		entityManager.persist(Carton);
	}

	public CartonEntity readOne(int id) {
		return entityManager.find(CartonEntity.class, id);
	}
	
	public List<CartonEntity> readAll() {
		return entityManager.createQuery("from CartonEntity").getResultList();
	}

	public void update(CartonEntity Carton) {
		entityManager.persist(Carton);
	}

	public void delete(CartonEntity Carton) {
		entityManager.remove(Carton);
	}

}
