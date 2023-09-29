package com.bookstore.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bookstore.model.Book;
import com.bookstore.model.Order;
import com.bookstore.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService{
    private final BookService service;
    private final Logger logger=(Logger) LoggerFactory.getLogger(OrderService.class);
    private final OrderRepository repository;
    public Order putAndOrder(List<Integer> bookIdList,String username){
        List<Optional<Book>> bookList=bookIdList.stream()
        .map(service::findBookById).collect(Collectors.toList());
        Double totalPrice=bookList.stream()
        .map(optionalBook->optionalBook.map(Book::getPrice).orElse(0.0))
        .reduce(0.0, Double::sum);
        Order order=Order.builder()
        .bookList(bookIdList)
        .totalPrice(totalPrice)
        .username(username)
        .build();
        return repository.save(order);
    }
}