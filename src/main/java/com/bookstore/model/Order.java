package com.bookstore.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table
@Data
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity(name = "bookOrder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private Double totalPrice;
    private List<Integer> bookList;

}
