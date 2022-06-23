package com.example.shoppingmall_my.repository;

import com.example.shoppingmall_my.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
