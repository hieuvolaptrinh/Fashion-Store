package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ChiTietPhieuNhap")
public class ChiTietPhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPN;
    private Double giaNhap;
    private Integer soLuongNhap;

    @ManyToOne
    @JoinColumn(name = "idSP")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "idPN")
    private PhieuNhap phieuNhap;
}
