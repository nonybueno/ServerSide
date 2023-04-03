package sit.int204.classicmodelservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "productCode", nullable = false)
    private String id;
    @Column(name = "productName", nullable = false)
    private String productName;
    @Column(name = "productLine", nullable = false)
    private String productLine;
    @Column(name = "productScale", nullable = false)
    private String productScale;
    @Column(name = "productVendor", nullable = false)
    private String productVendor;
    @Column(name = "productDescription", nullable = false)
    private String productDescription;
    @Column(name = "quantityInStock", nullable = false)
    private Integer quantityInStock;
    @Column(name = "buyPrice", nullable = false)
    private Double buyPrice;
    @Column(name = "MSRP", nullable = false)
    private Double price;
//    @JsonIgnore
//    @OneToMany(mappedBy= "product")
//    private Set<Orderdetail> orderdetails = new LinkedHashSet<>();
//    @ManyToOne
//    @JoinColumn(name = "productLine")
//    private Product products;
}
