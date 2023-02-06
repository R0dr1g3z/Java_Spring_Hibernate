package com.example.spring_hibernate.Service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Author;

public interface AuthorDao extends CrudRepository<Author, Integer> {
    Author findById(int id);
    Author findByEmail(String email);
    Author findByPesel(int pesel);
    List<Author> findByLastNameIgnoreCase(String lastName);
}
