package com.example.spring_hibernate.Controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Article;
import com.example.spring_hibernate.Class.Author;
import com.example.spring_hibernate.Class.Category;
import com.example.spring_hibernate.Service.ArticleDao;
import com.example.spring_hibernate.Service.AuthorDao;
import com.example.spring_hibernate.Service.CategoryDao;

@Controller
public class ArticleController {
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/createArticle")
    @ResponseBody
    public String createArticle(){
        Article article = new Article();
        Author author = authorDao.findById(3);
        List<Category> categories = Arrays.asList(categoryDao.findById(1), categoryDao.findById(2));
        article.setAuthor(author);
        article.setCategories(categories);
        article.setContent("Lorem ipsum nates made thiso nade");
        article.setTitle("Random title article number 001");
        LocalDateTime time = LocalDateTime.now();
        article.setCreated(time);
        article.setUpdated(time);
        articleDao.save(article);
        return "Create article";
    }

    @GetMapping("/readArticle")
    @ResponseBody
    public Article readArticle(){
        return articleDao.findById(3);
    }

    @GetMapping("/updateArticle")
    @ResponseBody
    public String updateArticle(){
        Article article = articleDao.findById(3);
        article.setUpdated(LocalDateTime.now());
        article.setTitle("Random editet title number 001");
        articleDao.save(article);
        return "Update article";
    }

    @GetMapping("/deleteArticle")
    @ResponseBody
    public String deleteArticle(){
        articleDao.deleteById(3);
        return "Delete article";
    }
}
