package com.alexanderneumann.springproductorderrestfulapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders", schema = "spring_product_order_restful_api")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String product;
    private int quantity;

    @Column(name = "total_price")
    private float totalPrice;
}
