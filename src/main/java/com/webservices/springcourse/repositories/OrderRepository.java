package com.webservices.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.springcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}