package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long cityId;

    private String cityName;

    @ManyToOne
    @JoinColumn(name = "countryId")
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<District> districts;

    public City() {

    }

}
