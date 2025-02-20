package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ChiTietGioHang")
public class ChiTietGioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCTGH;
    private Integer soLuongMua;
    private Double tongTien;

    @ManyToOne
    @JoinColumn(name = "idGH", nullable = false)
    private GioHang gioHang;

    @ManyToOne
    @JoinColumn(name = "idSP", nullable = false)
    private SanPham sanPham;
}
