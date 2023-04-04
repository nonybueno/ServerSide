package sit.int204.classicmodelsservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orderdetails")
public class Orderdetail {
    @Id
    @Column(name = "orderNumber")
    private String id;
    @Column(name = "productCode")
    private String productCode;
    @Column(name = "quantityOrdered")
    private Integer quantityOrdered;
    @Column(name = "priceEach")
    private Double priceEach;
    @Column(name="orderLineNumber")
    private Integer orderLineNumber;
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name = "productCode")
//    private Product product;
}
