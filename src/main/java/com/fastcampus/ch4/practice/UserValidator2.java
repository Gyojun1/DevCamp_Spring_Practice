package com.fastcampus.ch4.practice;


import org.apache.catalina.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator2 implements Validator {



    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;


        ValidationUtils.rejectIfEmpty(errors,"id","id.required");
        ValidationUtils.rejectIfEmpty(errors,"pwd","pwd.required");
    }

}
