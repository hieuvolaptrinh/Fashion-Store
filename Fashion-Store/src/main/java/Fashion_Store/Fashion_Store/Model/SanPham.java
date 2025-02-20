package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSP;

    private String tenSP;

    private String moTaSP;

    private Double giaBan;

    private Double giaNhap;

    private long soLuongBan;

    private long soLuongCon;

    private String imgSP;

    @ManyToOne
    @JoinColumn(name = "idLSP")
    private LoaiSanPham loaiSanPham;

    public SanPham() {
    }

    public long getIdSP() {
        return idSP;
    }

    public void setIdSP(long idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTaSP() {
        return moTaSP;
    }

    public void setMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    public String getImgSP() {
        return imgSP;
    }

    public void setImgSP(String imgSP) {
        this.imgSP = imgSP;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(long soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public long getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(long soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

}
