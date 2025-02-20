package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TinhThanh")
public class TinhThanh {
    @Id

    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String idTinhThanh;
    private String tenTinhThanh;

    @ManyToOne
    @JoinColumn(name = "idQuocGia")
    private QuocGia quocGia;

    @OneToMany(mappedBy = "tinhThanh")
    private List<QuanHuyen> listQuanHuyen;


    
    public TinhThanh(String idTinhThanh, String tenTinhThanh, QuocGia quocGia, List<QuanHuyen> listQuanHuyen) {
        this.idTinhThanh = idTinhThanh;
        this.tenTinhThanh = tenTinhThanh;
        this.quocGia = quocGia;
        this.listQuanHuyen = listQuanHuyen;
    }

    public String getIdTinhThanh() {
        return idTinhThanh;
    }

    public void setIdTinhThanh(String idTinhThanh) {
        this.idTinhThanh = idTinhThanh;
    }

    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public List<QuanHuyen> getListQuanHuyen() {
        return listQuanHuyen;
    }

    public void setListQuanHuyen(List<QuanHuyen> listQuanHuyen) {
        this.listQuanHuyen = listQuanHuyen;
    }


    
}
