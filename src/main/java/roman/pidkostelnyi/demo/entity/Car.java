package roman.pidkostelnyi.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

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
    private Country country;

    @ManyToMany(mappedBy = "cars")
    private List<User> users;

}
