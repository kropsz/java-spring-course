package com.webservices.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.springcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}