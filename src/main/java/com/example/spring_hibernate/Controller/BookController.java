package com.example.spring_hibernate.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Author;
import com.example.spring_hibernate.Class.Book;
import com.example.spring_hibernate.Service.AuthorDao;
import com.example.spring_hibernate.Service.BookDao;

@Controller
public class BookController {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;

    @GetMapping("/saveBook")
    @ResponseBody
    public String saveBook() {
        List<Author> authors = Arrays.asList(authorDao.findById(1), authorDao.findById(3));
        Book book = new Book();
        book.setTitle("Sand and soil");
        book.setDescription("Adventure on sand");
        book.setRating(5);
        book.setAuthors(authors);
        bookDao.save(book);
        return "Book is saved";
    }

    @GetMapping("/editBook")
    @ResponseBody
    public String editBook(){
        Book book = new Book();
        bookDao.save(book);
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

    @GetMapping("/readBooksByRating/{rating}")
    @ResponseBody
    public List<Book> readBooksByRating(@PathVariable int rating){
        return bookDao.findAllBooksByRating(rating);
    }

    @GetMapping("/findBooksWithAuthors")
    @ResponseBody
    public List<Book> findAllWithAuthors(){
        return bookDao.findAllWithAuthors();
    }

    @GetMapping("/findBooksWithAuthor/{id}")
    @ResponseBody
    public List<Book> findBooksWithAuthor(@PathVariable int id){
        List<Author> authors = Arrays.asList(authorDao.findById(id));
        return bookDao.findBooksByAuthor(authors);
    }
}
