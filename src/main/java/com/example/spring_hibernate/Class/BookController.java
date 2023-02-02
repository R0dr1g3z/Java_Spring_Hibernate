package com.example.spring_hibernate.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping("/saveBook")
    @ResponseBody
    public String saveBook() {
        bookDao.save(new Book(2, "Testing444", 5, "Testing description"));
        return "Book is saved";
    }

    @GetMapping("/editBook")
    @ResponseBody
    public String editBook(){
        bookDao.save(new Book(2, "Edited book", 10, "This book is edited by me"));
        return "Book is edited";
    }

    @GetMapping("/readBook")
    @ResponseBody
    public Book readBook(){
        Book book = bookDao.findById(1);
        return book;
    }

    @GetMapping("/deleteBook")
    @ResponseBody
    public String deleteBook(){
        int id = 1;
        bookDao.deleteById(id);
        return String.format("Book by ID:%s is deleted", id);
    }
}
