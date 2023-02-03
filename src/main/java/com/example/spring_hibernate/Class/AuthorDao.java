package com.example.spring_hibernate.Class;

import org.springframework.data.repository.CrudRepository;

public interface AuthorDao extends CrudRepository<Author, Integer> {
    
}
