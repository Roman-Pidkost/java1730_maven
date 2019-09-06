package roman.pidkostelnyi.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    private boolean abs;

    @OneToOne
    private Engine engine;

    @ManyToOne
    private Country countr123w21y;

    @ManyToMany(mappedBy = "cars")
    private List<User> users;

}
