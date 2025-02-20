package Fashion_Store.Fashion_Store.Model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String userName;

    private String soDienThoai;

    private String email;

    private String password;
    private String avatar;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false) // Tên cột trong database
    private QuyenHan role; // Đặt tên là role thay vì roleId để dễ hiểu

    public Users() {
    }

    public long getIdUser() {
        return userId;
    }

    public void setIdUser(long idUser) {
        this.userId = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return soDienThoai;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.soDienThoai = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
