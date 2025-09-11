package com.springboot.mvc.validation;
//6.1.1
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //define default course code
    public String value() default "MAN";

    //define default error message
    public String message() default  "must start with MAN";

    //define default groups
    //not giving any crouping just giving an emply collection , it can group constraint together
    public Class<?>[] groups() default {};

    //define default payloads
    //not using any payload, just giving default payload, payload can basically give additional details, it provide custom details about validation failure(severity level, error code, etc)
    public Class<? extends Payload>[] payload() default{};
}