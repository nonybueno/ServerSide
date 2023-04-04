package sit.int204.classicmodelsservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="customers")
public class Customer {
    @Id
    private Integer customerNumber;
    private String customerName;
    private String contactFirstName;
    private String contactLastName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    @ManyToOne
    @JoinColumn(name = "salesRepEmployeeNumber")
    private Employee salesRepEmployee;
    private Double creditLimit;
//    private String password;
}

