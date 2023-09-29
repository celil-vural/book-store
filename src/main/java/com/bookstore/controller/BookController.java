package com.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.BookOrderRequest;
import com.bookstore.model.Order;
import com.bookstore.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/bookstore")
@RequiredArgsConstructor
public class BookController {
    private final OrderService orderService;
    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest request){
        Order order=orderService.putAndOrder(request.getBookIdList(),request.getUsername());
        return ResponseEntity.ok(order);
    }
}
