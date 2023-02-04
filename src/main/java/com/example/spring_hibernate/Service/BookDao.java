package com.example.spring_hibernate.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Book;

public interface BookDao extends CrudRepository<Book, Integer> {
    
    Book findById(int id);

    @Query(value = "SELECT b FROM Book b WHERE b.rating > ?1")
    List<Book> findAllBooksByRating(int rating);
}
