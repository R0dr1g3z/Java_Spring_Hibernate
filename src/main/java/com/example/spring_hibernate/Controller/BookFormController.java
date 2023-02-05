package com.example.spring_hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Book;
import com.example.spring_hibernate.Service.AuthorDao;
import com.example.spring_hibernate.Service.BookDao;
import com.example.spring_hibernate.Service.PublisherDao;

@Controller
public class BookFormController {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private PublisherDao publisherDao;

    @GetMapping("/formBook")
    public String getFormBook(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorDao.findAll());
        model.addAttribute("publishers", publisherDao.findAll());
        return "books/book";
    }

    @PostMapping("/formBook")
    @ResponseBody
    public Book postFormBook(Book book){
        bookDao.save(book);
        return book;
    }

    @GetMapping("/formReadBook")
    public String formReadBookGet(Model model){
        model.addAttribute("books", bookDao.findAll());
        return "books/readBook";
    }

    @GetMapping("/formEditBook/{id}")
    public String formEditBook(Model model, @PathVariable int id){
        model.addAttribute("book", bookDao.findById(id));
        return "books/editBook";
    }

    @PostMapping("/formEditBook/{id}")
    @ResponseBody
    public Book formEditBook(Book book){
        bookDao.save(book);
        return book;
    }

    @GetMapping("/formDeleteBook/{id}")
    public String formDeleteBook(@PathVariable int id){
        bookDao.deleteById(id);
        return "redirect:/formReadBook";
    }
}
