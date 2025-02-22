package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;
    private Integer totalProducts;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users user;

    @OneToMany(mappedBy = "cart")
    private List<CartDetail> cartDetails;

    public Cart() {

    }

}
