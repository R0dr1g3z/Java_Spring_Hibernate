package com.example.spring_hibernate.Class;

import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Integer> {
    
    Book findById(int id);
}
