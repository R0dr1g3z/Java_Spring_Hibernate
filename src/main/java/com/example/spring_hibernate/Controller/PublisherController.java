package com.example.spring_hibernate.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Book;
import com.example.spring_hibernate.Class.BookDao;
import com.example.spring_hibernate.Class.Publisher;
import com.example.spring_hibernate.Class.PublisherDao;

@Controller
public class PublisherController {
    @Autowired
    private PublisherDao publisherDao;
    @Autowired
    private BookDao bookDao;

    @GetMapping("/createPublisher")
    @ResponseBody
    public String createPublisher() {
        Publisher publisher = new Publisher();
        Book book = new Book(3, "Calineczka", 8, "Book added to publisher");
        bookDao.save(book);
        List<Book> books = Arrays.asList(book);
        publisher.setName("Magazine Time 030");
        publisher.setBooks(books);
        publisherDao.save(publisher);
        return "Create publisher";
    }

    @GetMapping("/readPublisher")
    @ResponseBody
    public Optional<Publisher> readPublisher() {
        return publisherDao.findById(4);
    }

    @GetMapping("/updatePublisher")
    @ResponseBody
    public String updatePubsliher(){
        Publisher publisher = new Publisher();
        publisher.setName("Magazine Times 020");
        publisherDao.save(publisher);
        return "Update publisher";
    }

    @GetMapping("/deletePublisher")
    @ResponseBody
    public String deletePublisher(){
        publisherDao.deleteById(1);
        return "Deleted publisher";
    }
}