package roman.pidkostelnyi.demo.repository;

import roman.pidkostelnyi.demo.entity.Country;

import javax.persistence.EntityManager;
import java.util.List;

public class CountryRepository {

    private final EntityManager em;

    public CountryRepository(EntityManager em) {
        this.em = em;
    }

    public void create(Country country) {
        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();
    }

    public List<Country> findAll() {
        return em.createQuery("from Country", Country.class)
                .getResultList();
    }

    public Country findOne(Long id2) {
        return em.createQuery("from Country c where c.id = :myParamName", Country.class)
                .setParameter("myParamName", id2)
                .getSingleResult();
    }

    public void update(Country country) {
        em.getTransaction().begin();
        em.merge(country);
        em.getTransaction().commit();
    }

    public void delete(Long id) {
        em.getTransaction().begin();
        em.remove(findOne(id));
        em.getTransaction().commit();
    }
}
