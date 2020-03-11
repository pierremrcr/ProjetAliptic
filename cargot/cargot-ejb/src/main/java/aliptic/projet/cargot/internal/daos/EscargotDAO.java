package aliptic.projet.cargot.internal.daos;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import aliptic.projet.cargot.internal.Calibre;
import aliptic.projet.cargot.internal.Espece;
import aliptic.projet.cargot.internal.entities.EscargotEntity;

@Stateless
@Local
public class EscargotDAO {
	
	@PersistenceContext(unitName="cargotPersistenceUnit")
	EntityManager entityManager;

	public void createEscargot(int id, boolean isDisponible, Calibre calibre, Espece espece, double poids) {
		EscargotEntity escargot = new EscargotEntity(id, isDisponible, calibre, espece, poids);
		entityManager.persist(escargot);
	}

	public EscargotEntity getEscargotById(int id) {
		return (EscargotEntity) entityManager.createQuery("Select p from EscargotEntity p where p.id=:id").setParameter("id",id).getSingleResult();
	}
	
	public List<EscargotEntity> getAllEscargot() {
		TypedQuery<EscargotEntity> query = entityManager.createQuery("Select p from EscargotEntity p", EscargotEntity.class);
		List<EscargotEntity> escargots = query.getResultList();
		return escargots;
	}

	public void modifierEscargot(EscargotEntity Escargot) {
		entityManager.merge(Escargot);
	}

	public void deleteEscargot(int id) {
		EscargotEntity escargot = getEscargotById(id);
		entityManager.remove(escargot);
	}

}
