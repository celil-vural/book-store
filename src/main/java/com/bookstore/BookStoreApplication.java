package com.bookstore;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreApplication implements CommandLineRunner{
	private final BookRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Book book1=Book.builder()
		.name("Test 1")
		.author("null")
		.price(100.0)
		.stock(25)
		.build();
		Book book2=Book.builder()
		.name("Test 2")
		.author("null")
		.price(135.0)
		.stock(25)
		.build();
		Book book3=Book.builder()
		.name("Test 3")
		.author("null")
		.price(300.0)
		.stock(25)
		.build();
		repository.saveAll(Arrays.asList(book1,book2,book3));
	}

}
