package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "LoaiSanPham")
public class LoaiSanPham {
    @Id

    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String idLSP;
    private String tenSP;

    @OneToMany(mappedBy = "loaiSanPham")
    private List<SanPham> listSanPham;

    public LoaiSanPham(String idLSP, String tenSP, List<SanPham> listSanPham) {
        this.idLSP = idLSP;
        this.tenSP = tenSP;
        this.listSanPham = listSanPham;
    }

    public String getIdLSP() {
        return idLSP;
    }

    public void setIdLSP(String idLSP) {
        this.idLSP = idLSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public List<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(List<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }

}
