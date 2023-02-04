package com.example.spring_hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_hibernate.Class.Person;
import com.example.spring_hibernate.Class.PersonDetails;
import com.example.spring_hibernate.Service.PersonDao;

@Controller
public class PersonController {
    @Autowired
    private PersonDao personDao;
    
    @GetMapping("/createPerson")
    @ResponseBody
    public String createPerson(){
        Person person = new Person();
        PersonDetails personDetails = new PersonDetails();
        personDetails.setFirstName("Hamilton");
        personDetails.setLastName("Kolins");
        personDetails.setCity("Chicago");
        personDetails.setStreet("Sunner");
        personDetails.setStreetNumber(43);
        person.setPersonDetails(personDetails);
        person.setLogin("Konono");
        person.setPassword("Apple222");
        person.setEmail("Konono900@gmail.com");
        personDao.save(person);
        return "Create new person";
    }

    @GetMapping("/readPerson")
    @ResponseBody
    public Person readPerson(){
        return personDao.findById(1);
    }

    @GetMapping("/updatePerson")
    @ResponseBody
    public String updatePerson(){
        Person person = new Person();
        PersonDetails personDetails = new PersonDetails();
        personDetails.setId(1);
        personDetails.setFirstName("Patrick");
        personDetails.setLastName("Kolins");
        personDetails.setCity("Chicago");
        personDetails.setStreet("Sunner");
        personDetails.setStreetNumber(43);
        person.setPersonDetails(personDetails);
        person.setId(1);
        person.setLogin("Patricio");
        person.setPassword("Apple222");
        person.setEmail("Patricio900@gmail.com");
        personDao.save(person);
        return "Update person";
    }

    @GetMapping("/deletePerson")
    @ResponseBody
    public String deletePerson(){
        personDao.deleteById(1);
        return "Delete person";
    }

    @GetMapping("/person")
    public String person(Model model){
        model.addAttribute("person", new Person());
        return "person";
    }

    @PostMapping("/person")
    @ResponseBody
    public String person(Person person){
        personDao.save(person);
        return "Create new person from form";
    }
}
