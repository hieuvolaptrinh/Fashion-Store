package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "QuocGia")
public class QuocGia {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long maQuocGia;
    private String tenQuocGia;

    @OneToMany(mappedBy = "quocGia")
    private List<TinhThanh> listTinhThanh;

    public QuocGia(long maQuocGia, String tenQuocGia, List<TinhThanh> listTinhThanh) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
        this.listTinhThanh = listTinhThanh;
    }

    public long getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(long maQuocGia) {
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
