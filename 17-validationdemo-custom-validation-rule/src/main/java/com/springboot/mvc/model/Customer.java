package com.springboot.mvc.model;

import com.springboot.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

//1.1
public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value=10, message = "must be less that or equal to 10")
//    private int freePasses; //3.1
    private Integer freePasses; //5.1

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode; //4.1

    @CourseCode
    private String courseCode; //6.2

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
    /* 3.1
    public int getFreePasses() {
        return freePasses;
    }
    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
    */
    //5.2
    public Integer getFreePasses() {
        return freePasses;
    }
    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //6.2

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
