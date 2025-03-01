package Fashion_Store.Fashion_Store.Model;

import jakarta.persistence.*;

@Entity
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer productId;
        @Column(nullable = false)
        private String productName;

        private String description;

        private Double sellPrice;
        @Column(nullable = false)
        private Double purchasePrice;

        @Column(name = "soldQuantity")
        private Integer soldQuantity;


        private long stockQuantity;

        private String productImage;

        @ManyToOne
        @JoinColumn(name = "categoryId")
        private ProductCategory productCategory;

        public Product() {
        }

}
