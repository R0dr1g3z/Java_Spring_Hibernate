package com.example.spring_hibernate.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Author;
import com.example.spring_hibernate.Class.AuthorDao;

@Controller
public class AuthorController {
    @Autowired
    private AuthorDao authorDao;

    @GetMapping("/createAuthor")
    @ResponseBody
    public String createAuthor(){
        Author author = new Author();
        author.setFirstName("Nicka");
        author.setLastName("Kiri");
        authorDao.save(author);
        return "Crate new author";
    }

    @GetMapping("/readAuthor")
    @ResponseBody
    public Optional<Author> readAuthor(){
        return authorDao.findById(1);
    }

    @GetMapping("/updateAuthor")
    @ResponseBody
    public String updateAuthor(){
        authorDao.save(new Author(1, "Hany", "Will"));
        return "Updated author";
    }

    @GetMapping("/deleteAuthor")
    @ResponseBody
    public String deleteAuthor(){
        authorDao.deleteById(2);
        return "Author is deleted";
    }
}
