package com.ecommerce.ecommerce_backend.repositories;

import com.ecommerce.ecommerce_backend.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByProductId(Long productId);

}
