package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;
    @Column(nullable = false)
    private String supplierName;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "wardId")
    private Ward ward;

    @OneToMany(mappedBy = "supplier")
    private List<PurchaseOrder> purchaseOrder;

    public Supplier() {
    }

}
