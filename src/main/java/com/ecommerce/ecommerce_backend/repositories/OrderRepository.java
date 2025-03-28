package com.ecommerce.ecommerce_backend.repositories;


import com.ecommerce.ecommerce_backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByUserId(Long userId);

}
