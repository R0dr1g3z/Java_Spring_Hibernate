package com.example.spring_hibernate.Service;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Publisher;

public interface PublisherDao extends CrudRepository<Publisher, Integer> {
    
    Publisher findByNip(int nip);
    Publisher findByRegon(int regon);
}
