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
@Table(name = "QuanHuyen")
public class QuanHuyen {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String maQuanHuyen;

    private String tenQuanHuyen;

    @ManyToOne
    @JoinColumn(name = "maTinhThanhNo", nullable = false)
    private TinhThanh tinhThanh;

    @OneToMany(mappedBy = "quanHuyen")
    private List<PhuongXa> listPhuongXa;

    public QuanHuyen(String maQuanHuyen, String tenQuanHuyen, TinhThanh tinhThanh, List<PhuongXa> listPhuongXa) {
        this.maQuanHuyen = maQuanHuyen;
        this.tenQuanHuyen = tenQuanHuyen;
        this.tinhThanh = tinhThanh;
        this.listPhuongXa = listPhuongXa;
    }

    public String getMaQuanHuyen() {
        return maQuanHuyen;
    }

    public void setMaQuanHuyen(String maQuanHuyen) {
        this.maQuanHuyen = maQuanHuyen;
    }

    public String getTenQuanHuyen() {
        return tenQuanHuyen;
    }

    public void setTenQuanHuyen(String tenQuanHuyen) {
        this.tenQuanHuyen = tenQuanHuyen;
    }

    public TinhThanh getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(TinhThanh tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public List<PhuongXa> getListPhuongXa() {
        return listPhuongXa;
    }

    public void setListPhuongXa(List<PhuongXa> listPhuongXa) {
        this.listPhuongXa = listPhuongXa;
    }

}
