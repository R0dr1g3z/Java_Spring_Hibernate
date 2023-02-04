package com.example.spring_hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Book;
import com.example.spring_hibernate.Service.AuthorDao;
import com.example.spring_hibernate.Service.BookDao;

@Controller
public class BookFormController {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;

    @GetMapping("/formBook")
    public String formBook(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorDao.findAll());
        return "book";
    }

    @PostMapping("/formBook")
    @ResponseBody
    public Book formBookPost(Book book){
        bookDao.save(book);
        return book;
    }
}
