package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long countryId;
    @Column(nullable = false,unique = true)

    private String countryName;

    @OneToMany(mappedBy = "country")
    private List<City> citys;

    public Country() {

    }

}
