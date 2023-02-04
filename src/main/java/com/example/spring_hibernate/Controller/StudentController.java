package com.example.spring_hibernate.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Student;

@Controller
public class StudentController {
    @ModelAttribute("genders")
    public List<String> genders() {
        return Arrays.asList("Male", "Female");
    }

    @ModelAttribute("countries")
    public List<String> countries() {
        return Arrays.asList("Poland", "Germany", "France", "Russia", "Denmark");
    }

    @ModelAttribute("skills")
    public List<String> skills() {
        return Arrays.asList("Java", "Ruby", "Python", "JavaScript", "C++");
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        return Arrays.asList("Ball", "Computer", "Technologies", "Swimming", "Food");
    }

    @GetMapping("/student")
    public String getStudent(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/student")
    @ResponseBody
    public Student postStudent(Student student) {
        return student;
    }
}
