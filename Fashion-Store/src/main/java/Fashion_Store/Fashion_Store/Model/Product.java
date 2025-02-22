package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String productName;

    private String description;

    private Double sellPrice;

    private Double purchasePrice;

    private long soldQuantity;

    private long stockQuantity;

    private String productImage;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private ProductCategory productCategory;

    public Product() {
    }

}
