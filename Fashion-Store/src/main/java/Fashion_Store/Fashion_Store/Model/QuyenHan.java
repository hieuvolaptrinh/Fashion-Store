package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class QuyenHan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idQuyenHan;

    private String tenQH;

    @OneToMany(mappedBy = "quyenHan", cascade = CascadeType.ALL)
    private List<Users> users;

    public QuyenHan() {
    }

    public long getIdQuyenHan() {
        return idQuyenHan;
    }

    public void setIdQuyenHan(long idQuyenHan) {
        this.idQuyenHan = idQuyenHan;
    }

    public String getTenQH() {
        return tenQH;
    }

    public void setTenQH(String tenQH) {
        this.tenQH = tenQH;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

}
