package com.example.spring_hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_hibernate.Class.Author;
import com.example.spring_hibernate.Service.AuthorDao;

@Controller
public class AuthorFormController {
    @Autowired
    private AuthorDao authorDao;

    @GetMapping("/formAuthor")
    public String formAuthorGet(Model model){
        model.addAttribute("author", new Author());
        return "author/author";
    }

    @PostMapping("/formAuthor")
    public String formAuthorPost(Author author){
        authorDao.save(author);
        return "redirect:/formReadAuthor";
    }

    @GetMapping("/formReadAuthor")
    public String formReadAuthor(Model model){
        model.addAttribute("authors", authorDao.findAll());
        return "author/authors";
    }

    @GetMapping("/formEditAuthor/{id}")
    public String formEditAuthorGet(Model model, @PathVariable int id){
        model.addAttribute("author", authorDao.findById(id));
        return "author/editAuthor";
    }

    @PostMapping("/formEditAuthor/{id}")
    public String formEditAuthorPost(Author author){
        authorDao.save(author);
        return "redirect:/formReadAuthor";
    }

    @GetMapping("/formDeleteAuthor/{id}")
    public String formDeleteAuthorGet(@PathVariable int id){
        authorDao.deleteById(id);
        return "redirect:/formReadAuthor";
    }
}
