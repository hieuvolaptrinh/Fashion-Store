package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PhieuNhap")
public class PhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPN;
    private String ngayNhapHang;

    @OneToMany(mappedBy = "phieuNhap")
    private List<ChiTietPhieuNhap> listChiTietPhieuNhap;

    public Long getIdPN() {
        return idPN;
    }

    public void setIdPN(Long idPN) {
        this.idPN = idPN;
    }

    public String getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(String ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public List<ChiTietPhieuNhap> getListChiTietPhieuNhap() {
        return listChiTietPhieuNhap;
    }

    public void setListChiTietPhieuNhap(List<ChiTietPhieuNhap> listChiTietPhieuNhap) {
        this.listChiTietPhieuNhap = listChiTietPhieuNhap;
    }

}
