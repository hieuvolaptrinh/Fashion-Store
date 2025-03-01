package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long cityId;
    @Column(nullable = false,unique = true)
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "countryId")
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<District> districts;

    public City() {

    }

}
