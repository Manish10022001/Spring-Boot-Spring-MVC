package com.springboot.mvc.controller;

import com.springboot.mvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//1.2
@Controller
public class CustomerController {
    //1.2.1 - to show form
    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    //1.4 performing validation in controller
    @PostMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult){

        if(theBindingResult.hasErrors()){
            return "customer-form";
        }
        else{
            return "customer-confirmation";
        }
    }
    // add an initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
    //2.1
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        //StringTrimmerEditor is a class defined in Spring api, it removies whitespaces - leading and trailing
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true); //true means null, it will trim to null if all white spaces are there

        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor); //using databinder and register it as custom editor,
                                                    //so for every string class apply stringTrimmer Editor
    }
}
