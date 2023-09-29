package com.bookstore.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repository;

    public Optional<Book> findBookById(Integer bookId) {
        return repository.findById(bookId);
    }
}
