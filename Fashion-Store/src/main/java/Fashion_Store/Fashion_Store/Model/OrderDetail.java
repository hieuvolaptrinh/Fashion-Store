package Fashion_Store.Fashion_Store.Model;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer orderDetailId;

    private Date orderDate;

    private Integer quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    public OrderDetail() {

    }

}
