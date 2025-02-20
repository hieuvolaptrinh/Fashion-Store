package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DonHang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDH;
    private Double tongTien;
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "idKH", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "idTT", nullable = false)
    private ThanhToan thanhToan;

    @OneToMany(mappedBy = "donHang")
    private List<ChiTietDonHang> listChiTietDonHang;

    public DonHang(Long idDH, Double tongTien, String trangThai, Users user, ThanhToan thanhToan,
            List<ChiTietDonHang> listChiTietDonHang) {
        this.idDH = idDH;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.user = user;
        this.thanhToan = thanhToan;
        this.listChiTietDonHang = listChiTietDonHang;
    }

    public Long getIdDH() {
        return idDH;
    }

    public void setIdDH(Long idDH) {
        this.idDH = idDH;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public ThanhToan getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(ThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public List<ChiTietDonHang> getListChiTietDonHang() {
        return listChiTietDonHang;
    }

    public void setListChiTietDonHang(List<ChiTietDonHang> listChiTietDonHang) {
        this.listChiTietDonHang = listChiTietDonHang;
    }

}
