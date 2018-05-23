package rs.edu.educons.it.is.MB.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rs.edu.educons.it.is.MB.entity.Predmet;

@Repository
@Transactional // anotacija za da ako se ne izbrise dobro iz baze, nju vraca na prethondo
				// stanje
public class PredmetRepository {

	@Autowired
	EntityManager em;

	public Predmet findById(Long id) {
		return em.find(Predmet.class, id);
	}

	public void deleteById(Long id) {

		Predmet predmet = findById(id);

		em.remove(predmet);

	}

	public void save(Predmet predmet) {

		if (predmet.getId() == null) {
			em.persist(predmet);
		} else {
			em.merge(predmet);
		}

	}

}
