package Fashion_Store.Fashion_Store.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductCategory")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer categoryId;
    // tên loại sản phẩm
    @Column(nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "productCategory")
    private List<Product> products;

    public ProductCategory() {
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
