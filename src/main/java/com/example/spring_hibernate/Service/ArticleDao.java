package com.example.spring_hibernate.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.spring_hibernate.Class.Article;

public interface ArticleDao extends CrudRepository<Article, Integer> {
    Article findById(int id);

    @Query(value = "SELECT a FROM Article a ORDER BY a.id DESC LIMIT 5")
    List<Article> find5Article();
}
