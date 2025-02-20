package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "QuocGia")
public class QuocGia {
    @Id

    private String maQuocGia;
    private String tenQuocGia;

    @OneToMany(mappedBy = "quocGia")
    private List<TinhThanh> listTinhThanh;

    public QuocGia(String maQuocGia, String tenQuocGia, List<TinhThanh> listTinhThanh) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
        this.listTinhThanh = listTinhThanh;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public List<TinhThanh> getListTinhThanh() {
        return listTinhThanh;
    }

    public void setListTinhThanh(List<TinhThanh> listTinhThanh) {
        this.listTinhThanh = listTinhThanh;
    }

}
