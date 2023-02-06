package com.example.spring_hibernate.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Author;
import com.example.spring_hibernate.Class.Book;

public interface BookDao extends CrudRepository<Book, Integer> {
    
    Book findById(int id);

    List<Book> findByTitle(String title);

    Book findByAuthors_id(int id);

    @Query(value = "SELECT b FROM Book b WHERE b.rating > ?1")
    List<Book> findAllBooksByRating(int rating);

    @Query(value = "SELECT b FROM Book b JOIN b.authors")
    List<Book> findAllWithAuthors();

    @Query(value = "SELECT b FROM Book b WHERE b.authors IN ?1")
    List<Book> findBooksByAuthor(List<Author> authors);
}
