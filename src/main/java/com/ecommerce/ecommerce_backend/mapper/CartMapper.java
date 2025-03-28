package com.ecommerce.ecommerce_backend.mapper;

import com.ecommerce.ecommerce_backend.dto.CartDTO;
import com.ecommerce.ecommerce_backend.dto.CartItemDTO;
import com.ecommerce.ecommerce_backend.model.Cart;
import com.ecommerce.ecommerce_backend.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userId",source = "user.id")
    CartDTO toCartDTO(Cart cart);
    @Mapping(target = "user.id",source = "userID")
    Cart toEntity(CartDTO cartDTO);
    @Mapping(target = "productID",source = "product.id")
    CartItemDTO toDTO(CartItem cartItem);
    @Mapping(target = "product.id",source = "productID")
    CartItem toEntity(CartItemDTO cartItemDTO);
}

