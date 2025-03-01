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


        private Integer soldQuantity;


        private int quantity;

        private String productImage;

        @ManyToOne
        @JoinColumn(name = "categoryId")
        private ProductCategory productCategory;

        public Product() {
        }

}
