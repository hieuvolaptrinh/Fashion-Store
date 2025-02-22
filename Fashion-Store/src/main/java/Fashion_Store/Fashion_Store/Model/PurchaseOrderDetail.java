package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PurchaseOrderDetail")
public class PurchaseOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer purchaseOrderDetailId; // Đổi tên khóa chính thành 'id' để tránh trùng với khóa ngoại

    private double purchasePrice;
    private int quantityPurchased;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "purchaseId")
    private PurchaseOrder purchaseOrder;

    public PurchaseOrderDetail() {

    }

}
