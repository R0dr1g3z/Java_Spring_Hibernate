package com.example.spring_hibernate.Service;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Article;

public interface ArticleDao extends CrudRepository<Article, Integer> {
    Article findById(int id);
}
