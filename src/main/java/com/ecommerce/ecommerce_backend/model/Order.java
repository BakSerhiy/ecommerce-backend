package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private String address;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    public  enum OrderStatus {
        PREPARING,DELIVERED,COMPLETED,CANCELLED
    }
    @OneToMany(mappedBy = "order" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();



}

