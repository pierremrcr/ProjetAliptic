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
import aliptic.projet.cargot.internal.entities.VerrineEntity;

@Stateless
@Local
public class VerrineDAO {
	
	@PersistenceContext(unitName="cargotPersistenceUnit")
	EntityManager entityManager;

	public void create(Calibre calibre, Espece espece, int quantiteMax,List<EscargotEntity> escargots) {
		VerrineEntity verrine = new VerrineEntity(calibre, espece, quantiteMax, escargots);
		entityManager.persist(verrine);
	}

	public VerrineEntity getVerrineById(int id) {
		return (VerrineEntity) entityManager.createQuery("Select v from VerrineEntity v where v.id=:id").setParameter("id",id).getSingleResult();
	}
	
	public List<VerrineEntity> getAllVerrines() {
		TypedQuery<VerrineEntity> query = entityManager.createQuery("Select p from VerrineEntity p",VerrineEntity.class);
		List<VerrineEntity> verrines = query.getResultList();
		return verrines;
	}

	public void update(VerrineEntity verrine) {
		entityManager.merge(verrine);
	}

	public void delete(VerrineEntity Verrine) {
		entityManager.remove(Verrine);
	}
	
	public void deleteVerrineById(int id) {
		VerrineEntity verrine = getVerrineById(id);
		entityManager.remove(verrine);
	}

}
