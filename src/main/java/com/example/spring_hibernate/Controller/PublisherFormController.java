package com.example.spring_hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_hibernate.Class.Publisher;
import com.example.spring_hibernate.Service.PublisherDao;

@Controller
public class PublisherFormController {
    @Autowired
    private PublisherDao publisherDao;

    @GetMapping("/formPublisher")
    public String formPublisherGet(Model model){
        model.addAttribute("publisher", new Publisher());
        return "publisher/publisher";
    }

    @PostMapping("/formPublisher")
    public String formPublisherPost(Publisher publisher){
        publisherDao.save(publisher);
        return "redirect:/formReadPublisher";
    }

    @GetMapping("/formReadPublisher")
    public String formReadPublisher(Model model){
        model.addAttribute("publishers", publisherDao.findAll());
        return "publisher/publishers";
    }

    @GetMapping("/formEditPublisher/{id}")
    public String formEditPublisherGet(Model model, @PathVariable int id){
        model.addAttribute("publisher", publisherDao.findById(id));
        return "publisher/editPublisher";
    }

    @PostMapping("/formEditPublisher/{id}")
    public String formEditPublisherPost(Publisher publisher){
        publisherDao.save(publisher);
        return "redirect:/formReadPublisher";
    }

    @GetMapping("/formDeletePublisher/{id}")
    public String formDeletePublisher(@PathVariable int id){
        publisherDao.deleteById(id);
        return "redirect:/formReadPublisher";
    }
}
