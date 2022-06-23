package com.example.shoppingmall_my.repository;

import com.example.shoppingmall_my.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
