package roman.pidkostelnyi.demo;

import roman.pidkostelnyi.demo.entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoApplication {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("blablabla");
        EntityManager em = factory.createEntityManager();

        Car car = new Car(5L, "Audi a8", 20000L, 3.0, true);
        em.getTransaction().begin();
        em.persist(car);

        em.getTransaction().commit();
        System.out.println(true);
        System.out.println("asdsad");
        em.close();
        factory.close();
    }
}
