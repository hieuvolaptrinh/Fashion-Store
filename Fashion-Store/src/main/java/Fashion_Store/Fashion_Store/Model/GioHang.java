package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "GioHang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGH;
    private Integer tongSanPham;

    @OneToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Users user;

    @OneToMany(mappedBy = "gioHang")
    private List<ChiTietGioHang> listChiTietGioHang;

    public GioHang(Long idGH, Integer tongSanPham, Users user, List<ChiTietGioHang> listChiTietGioHang) {
        this.idGH = idGH;
        this.tongSanPham = tongSanPham;
        this.user = user;
        this.listChiTietGioHang = listChiTietGioHang;
    }

    public Long getIdGH() {
        return idGH;
    }

    public void setIdGH(Long idGH) {
        this.idGH = idGH;
    }

    public Integer getTongSanPham() {
        return tongSanPham;
    }

    public void setTongSanPham(Integer tongSanPham) {
        this.tongSanPham = tongSanPham;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<ChiTietGioHang> getListChiTietGioHang() {
        return listChiTietGioHang;
    }

    public void setListChiTietGioHang(List<ChiTietGioHang> listChiTietGioHang) {
        this.listChiTietGioHang = listChiTietGioHang;
    }

}
