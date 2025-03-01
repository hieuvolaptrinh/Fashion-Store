package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer purchaseId;
    // ngày nhập hàng
    @Temporal(TemporalType.TIMESTAMP)
    private String purchaseDate;

    @OneToMany(mappedBy = "purchaseOrder")
    private List<PurchaseOrderDetail> purchaseOrderDetails;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    public PurchaseOrder() {
    }
}
