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
@Table(name = "District")
public class District {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long districtId;

    private String districtName;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City city;

    @OneToMany(mappedBy = "district")
    private List<Ward> wards;

    public District() {

    }

}
