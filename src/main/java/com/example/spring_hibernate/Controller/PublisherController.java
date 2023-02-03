package com.example.spring_hibernate.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Publisher;
import com.example.spring_hibernate.Class.PublisherDao;

@Controller
public class PublisherController {
    @Autowired
    private PublisherDao publisherDao;

    @GetMapping("/createPublisher")
    @ResponseBody
    public String createPublisher() {
        Publisher publisher = new Publisher();
        publisher.setName("Magazine Time 010");
        publisherDao.save(publisher);
        return "Create publisher";
    }

    @GetMapping("/readPublisher")
    @ResponseBody
    public Optional<Publisher> readPublisher() {
        return publisherDao.findById(1);
    }

    @GetMapping("/updatePublisher")
    @ResponseBody
    public String updatePubsliher(){
        publisherDao.save(new Publisher(1, "Magazine Times 020"));
        return "Update publisher";
    }

    @GetMapping("/deletePublisher")
    @ResponseBody
    public String deletePublisher(){
        publisherDao.deleteById(1);
        return "Deleted publisher";
    }
}
