package com.ecommerce.ecommerce_backend.mapper;

import com.ecommerce.ecommerce_backend.dto.CommentDTO;
import com.ecommerce.ecommerce_backend.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CommmetMapper {

    @Mapping(target = "userID",source = "user.id")
    CommentDTO toDTO(Comment comment);

    @Mapping(target = "user.id",source = "userID")
    @Mapping(target = "product",ignore = true)
    Comment toEntity(CommentDTO commentDTO);
}
