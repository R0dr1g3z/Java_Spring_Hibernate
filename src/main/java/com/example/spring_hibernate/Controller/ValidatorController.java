package com.example.spring_hibernate.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Book;
import com.example.spring_hibernate.Service.BookDao;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@Controller
public class ValidatorController {
    @Autowired
    private Validator validator;
    @Autowired
    private BookDao bookDao;

    @GetMapping("/validate")
    @ResponseBody
    public String validate() {
        Book book = new Book();
        book.setTitle("as");
        book.setRating(22);
        StringBuilder sb = new StringBuilder();
        Set<ConstraintViolation<Book>> validate = validator.validate(book);
        if (validate.isEmpty()) {
            bookDao.save(book);
        } else {
            for (ConstraintViolation<Book> c : validate) {
                sb.append(String.format("%s: %s <br>", c.getPropertyPath(), c.getMessage()));
            }
        }
        return sb.toString();
    }
}
