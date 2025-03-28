package com.ecommerce.ecommerce_backend.mapper;

import com.ecommerce.ecommerce_backend.dto.OrderDTO;
import com.ecommerce.ecommerce_backend.dto.OrderItemDTO;
import com.ecommerce.ecommerce_backend.model.Order;
import com.ecommerce.ecommerce_backend.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "orderID",source = "order.id")
    @Mapping(target = "orderItems",source = "items")
    OrderDTO toOrderDTO(Order order);

    @Mapping(target = "order.id",source = "OrderID")
    @Mapping(target = "items",source = "orderItems")
    Order toEntity(OrderDTO orderDTO);

    List<OrderDTO> toDTOs(List<Order> orders);

    List<Order> toEntities(List<OrderDTO> orderDTOs);

    @Mapping(target = "productID",source="product.id")
    OrderItemDTO toorderItemDTO(OrderItem orderItem);

    @Mapping(target = "product.id",source = "productID")
    OrderItem toOrderItemEntity(OrderItemDTO orderItemDTO);

    List<OrderItemDTO> toOrderItemDTOs(List<OrderItem> orderItem);

    List<OrderItem> toOrderItemEntities(List<OrderItemDTO> orderItemDTO);

}
