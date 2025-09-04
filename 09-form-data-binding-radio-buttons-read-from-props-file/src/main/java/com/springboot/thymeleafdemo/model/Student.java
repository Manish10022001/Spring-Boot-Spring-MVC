package com.springboot.thymeleafdemo.model;
//6.1
public class Student {
    //fields
    private String firstName;
    private String lastName;
    private String country; //7.2
    private String favoriteLanguage;
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
    //7.2
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    //9.2
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
