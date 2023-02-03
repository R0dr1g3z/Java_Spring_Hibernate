package com.example.spring_hibernate.Service;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Book;

public interface BookDao extends CrudRepository<Book, Integer> {
    
    Book findById(int id);
}
