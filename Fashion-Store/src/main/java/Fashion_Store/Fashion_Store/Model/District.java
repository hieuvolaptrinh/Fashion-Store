package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "District")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "districtId")
    private Integer districtId;

    @Column(name = "districtName", nullable = false)
    private String districtName;

    @ManyToOne
    @JoinColumn(name = "cityId", nullable = false) // Khóa ngoại
    private City city;

    // Constructor không tham số (bắt buộc)
    public District() {}

    // Getter và Setter
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
