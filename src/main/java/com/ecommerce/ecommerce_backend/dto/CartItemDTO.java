package com.ecommerce.ecommerce_backend.dto;

import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    private Long productId;
    private Integer quantity;
}
