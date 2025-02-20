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
@Table(name = "PhuongXa")
public class PhuongXa {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String idPhuongXa;

    private String tenPhuongXa;

    @ManyToOne
    @JoinColumn(name = "maQuanHuyenNo")
    private QuanHuyen quanHuyen;

    @OneToMany(mappedBy = "phuongXa")
    private List<Users> listUsers;

    public String getIdPhuongXa() {
        return idPhuongXa;
    }

    public void setIdPhuongXa(String idPhuongXa) {
        this.idPhuongXa = idPhuongXa;
    }

    public String getTenPhuongXa() {
        return tenPhuongXa;
    }

    public void setTenPhuongXa(String tenPhuongXa) {
        this.tenPhuongXa = tenPhuongXa;
    }

    public QuanHuyen getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(QuanHuyen quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public List<Users> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<Users> listUsers) {
        this.listUsers = listUsers;
    }

}
