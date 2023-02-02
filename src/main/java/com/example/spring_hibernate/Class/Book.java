package com.example.spring_hibernate.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int rating;
    private String description;

    public Book() {
    }

    public Book(int id, String title, int rating, String description) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.description = description;
    }
}
