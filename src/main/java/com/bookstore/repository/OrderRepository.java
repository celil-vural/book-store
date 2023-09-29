package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
    
}
