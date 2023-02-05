package com.example.spring_hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring_hibernate.Service.ArticleDao;

@Controller
public class HomePageController {
    @Autowired
    private ArticleDao articleDao;
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("articles", articleDao.find5Article());
        return "home";
    }
}
