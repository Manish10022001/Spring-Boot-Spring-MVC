package com.springboot.thymeleafdemo.model;
//6.1
public class Student {
    //fields
    public String firstName;
    public String lastName;

    public Student(){

    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
