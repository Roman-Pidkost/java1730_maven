package roman.pidkostelnyi.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double volume;

    private Integer power;

    private String serialNumber;

    @OneToOne(mappedBy = "engine")
    private Car car;

}
