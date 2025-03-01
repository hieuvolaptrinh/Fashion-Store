package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;
    @Column(nullable = false)
    private Integer totalProducts;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @OneToMany(mappedBy = "cart")
    private List<CartDetail> cartDetails;

    public Cart() {

    }

}
