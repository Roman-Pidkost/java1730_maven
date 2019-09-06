package roman.pidkostelnyi.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    private Long id;

    private String name;

    private Long price;

    private Double volume;

    private boolean abs;

    public Car() {
    }

    public Car(Long id, String name, Long price, Double volume, boolean abs) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", abs=" + abs +
                '}';
    }
}
