package com.cda;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String customer;
    private String status;

    public Order() {}
    public Order(String customer) {
        this.customer = customer;
        this.status = "PENDING";
    }

}
