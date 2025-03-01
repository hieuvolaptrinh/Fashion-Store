package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "[Ward]")
public class Ward {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer wardId;
    @Column(nullable = false)
    private String wardName;

    @ManyToOne
    @JoinColumn(name = "districtId")
    private District district;

    @OneToMany(mappedBy = "ward")
    private List<User> users;

    @OneToMany(mappedBy = "ward")
    List<Supplier> suppliers;

    public Ward() {
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

}
