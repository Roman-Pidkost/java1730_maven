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

        em.close();
        factory.close();
    }
}
