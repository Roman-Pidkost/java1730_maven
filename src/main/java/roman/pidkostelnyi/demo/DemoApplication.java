package roman.pidkostelnyi.demo;

import roman.pidkostelnyi.demo.entity.Car;
import roman.pidkostelnyi.demo.entity.Country;
import roman.pidkostelnyi.demo.repository.CountryRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DemoApplication {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("blablabla");
        EntityManager em = factory.createEntityManager();

        CountryRepository countryRepository = new CountryRepository(em);


        Car car = Car.builder()
                .name("Infiniti Q50S")
                .price(18000L)
                .country(countryRepository.findOne(4L))
                .abs(true)
                .build();

        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();

//        Country country = new Country();
//        country.setName("USA");
//        country.setId(4L);

//        em.getTransaction().begin();
//        em.persist(country);
//        em.getTransaction().commit();
//        countryRepository.create(country);


//        em.getTransaction().begin();
//        em.remove(country);
//        em.getTransaction().commit();

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
