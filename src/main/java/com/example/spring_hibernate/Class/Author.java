package com.example.spring_hibernate.Class;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.pl.PESEL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @PESEL
    private int pesel;
    @Email
    private String email;
    @ManyToMany
    private List<Book> books = new ArrayList<>();
}
