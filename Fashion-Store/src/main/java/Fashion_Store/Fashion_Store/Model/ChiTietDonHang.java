package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ChiTietDonHang")
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCTDH;
    private String ngay;
    private Integer soLuong;
    private Double giaBanTaiThoiDiem;

    @ManyToOne
    @JoinColumn(name = "idDH", nullable = false)
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name = "maSP", nullable = false)
    private SanPham sanPham;

    public Long getIdCTDH() {
        return idCTDH;
    }

    public void setIdCTDH(Long idCTDH) {
        this.idCTDH = idCTDH;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGiaBanTaiThoiDiem() {
        return giaBanTaiThoiDiem;
    }

    public void setGiaBanTaiThoiDiem(Double giaBanTaiThoiDiem) {
        this.giaBanTaiThoiDiem = giaBanTaiThoiDiem;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public ChiTietDonHang(Long idCTDH, String ngay, Integer soLuong, Double giaBanTaiThoiDiem, DonHang donHang,
            SanPham sanPham) {
        this.idCTDH = idCTDH;
        this.ngay = ngay;
        this.soLuong = soLuong;
        this.giaBanTaiThoiDiem = giaBanTaiThoiDiem;
        this.donHang = donHang;
        this.sanPham = sanPham;
    }

}
