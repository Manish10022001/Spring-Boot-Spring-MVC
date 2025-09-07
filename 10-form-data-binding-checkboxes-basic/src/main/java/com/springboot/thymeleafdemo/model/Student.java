package com.springboot.thymeleafdemo.model;
import java.util.List;

//6.1
public class Student {
    //fields
    private String firstName;
    private String lastName;
    private String country; //7.2
    private String favoriteLanguage; //9.2
    //can shoose list of favorite systems so use List
    private List<String> favoriteSystem; //11.2
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

    //11.2
    public List<String> getFavoriteSystem() {
        return favoriteSystem;
    }
    public void setFavoriteSystem(List<String> favoriteSystem) {
        this.favoriteSystem = favoriteSystem;
    }
}
