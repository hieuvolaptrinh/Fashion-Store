package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "District")
public class District {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long districtId;
    @Column(nullable = false)
    private String districtName;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City city;

    @OneToMany(mappedBy = "district")
    private List<Ward> wards;

    public District() {

    }

}
