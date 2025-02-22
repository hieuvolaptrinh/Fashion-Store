package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer purchaseId;
    // ngày nhập hàng
    private String purchaseDate;

    @OneToMany(mappedBy = "purchaseOrder")
    private List<PurchaseOrderDetail> purchaseOrderDetails;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    public PurchaseOrder() {
    }
}
