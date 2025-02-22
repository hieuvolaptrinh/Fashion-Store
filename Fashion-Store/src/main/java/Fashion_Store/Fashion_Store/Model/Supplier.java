package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;
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
