package com.ecommerce.ecommerce_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import com.ecommerce.ecommerce_backend.model.Order;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class OrderDTO {
    private Long id;
    private Long userID;
    @NotBlank(message = "Address is required")
    private String address;
    @NotBlank(message = "Phone is required")
    private String phoneNumber;
    private  Order.OrderStatus status;
    private LocalDateTime createdAt;
    private List<OrderItemDTO> orderItems;


}
