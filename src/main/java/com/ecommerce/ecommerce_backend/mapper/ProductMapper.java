package com.ecommerce.ecommerce_backend.mapper;


import com.ecommerce.ecommerce_backend.dto.CommentDTO;
import com.ecommerce.ecommerce_backend.dto.ProductDTO;
import com.ecommerce.ecommerce_backend.model.Comment;
import com.ecommerce.ecommerce_backend.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {


    @Mapping(target = "image",source = "image")
    ProductDTO toDTO(Product product);

    @Mapping(target = "image",source = "image")
    Product toEntity(ProductDTO productDTO);

    CommentDTO toDTO(Comment comment);

    Comment toEntity(CommentDTO commentDTO);

}
