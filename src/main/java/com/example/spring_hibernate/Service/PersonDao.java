package com.example.spring_hibernate.Service;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {
    Person findById(int id);
}
