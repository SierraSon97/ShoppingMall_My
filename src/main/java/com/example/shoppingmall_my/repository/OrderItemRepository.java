package com.example.shoppingmall_my.repository;

import com.example.shoppingmall_my.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
