package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name= "ORDER DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "PRODUCT_ID")
    private long productId;
    @Column(name = "QUANTITY")
    private long quantity;
    @Column(name = "ORDER DATE")
    private Instant orderDate;
    @Column(name = "STATUS")
    private String orderStatus;
    @Column(name= "AMOUNT")
    private long amount;

}