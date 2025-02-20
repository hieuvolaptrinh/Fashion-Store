package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "ThanhToan")
public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTT;
    private String phuongThuc;
    private String trangThai;

    @OneToMany(mappedBy = "thanhToan")
    private List<DonHang> listDonHang;

    public ThanhToan(Long idTT, String phuongThuc, String trangThai, List<DonHang> listDonHang) {
        this.idTT = idTT;
        this.phuongThuc = phuongThuc;
        this.trangThai = trangThai;
        this.listDonHang = listDonHang;
    }

    public Long getIdTT() {
        return idTT;
    }

    public void setIdTT(Long idTT) {
        this.idTT = idTT;
    }

    public String getPhuongThuc() {
        return phuongThuc;
    }

    public void setPhuongThuc(String phuongThuc) {
        this.phuongThuc = phuongThuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public List<DonHang> getListDonHang() {
        return listDonHang;
    }

    public void setListDonHang(List<DonHang> listDonHang) {
        this.listDonHang = listDonHang;
    }

}
