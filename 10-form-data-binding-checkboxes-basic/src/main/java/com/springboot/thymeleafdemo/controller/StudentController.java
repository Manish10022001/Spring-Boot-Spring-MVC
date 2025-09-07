package com.springboot.thymeleafdemo.controller;

import com.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//6.2
@Controller
public class StudentController {

    @Value("${countries}") //8.2 define field and use @value annotation to get the countire vlaues from application.properties
    private List<String> countries;

    @Value("${languages}")//10.2
    private List<String> languages;

    //method to show form
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        //create s student object
        Student theStudent = new Student();

        //add student object to the model
        theModel.addAttribute("student",theStudent);

        //8.3 add the list of countries to the model
        theModel.addAttribute("countries", countries); //8.3

        //10.3 add the list of languages to model
        theModel.addAttribute("languages",languages);

        return "student-form";
    }

    //6.4
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        //log the input data
        System.out.println("The Student : "+theStudent.getFirstName()+" "+theStudent.getLastName());
        return "student-confirmation";
    }
}

