package Fashion_Store.Fashion_Store.Model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cityId") // Đặt tên cột rõ ràng
    private Integer cityId;

    @Column(name = "cityName", nullable = false, unique = true)
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "countryId", nullable = false) // Thêm nullable=false để tránh lỗi dữ liệu null
    private Country country;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<District> districts;

    // Constructor không tham số (bắt buộc)
    public City() {}

    // Getter và Setter
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
