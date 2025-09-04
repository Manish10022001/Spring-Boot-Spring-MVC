package com.springboot.thymeleafdemo.controller;

import com.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//6.2
@Controller
public class StudentController {
    //method to show form
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        //create s student object
        Student theStudent = new Student();

        //add student object to the model
        theModel.addAttribute("student",theStudent);
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

