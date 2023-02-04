package com.example.spring_hibernate.Service;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Category;

public interface CategoryDao extends CrudRepository<Category, Integer> {
    Category findById(int id);
}
