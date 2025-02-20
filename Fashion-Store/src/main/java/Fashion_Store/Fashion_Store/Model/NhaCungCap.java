package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "NhaCungCap")
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNCC;
    private String tenNCC;
    private String soDienThoai;
    private String nhanVienLienHe;
    private String diaChi;

    @OneToMany(mappedBy = "nhaCungCap")
    private List<PhieuNhap> phieuNhap;

    public NhaCungCap() {
    }

    public Long getIdNCC() {
        return idNCC;
    }

    public void setIdNCC(Long idNCC) {
        this.idNCC = idNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhanVienLienHe() {
        return nhanVienLienHe;
    }

    public void setNhanVienLienHe(String nhanVienLienHe) {
        this.nhanVienLienHe = nhanVienLienHe;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
