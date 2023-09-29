package com.bookstore.exeption;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookNotFoundException extends NotFoundException{
    private final String message;
    public BookNotFoundException(String message) {
        super();
        this.message = message;
    }
    public BookNotFoundException(){
        super();
        this.message = "Book not found";
    } 

}
