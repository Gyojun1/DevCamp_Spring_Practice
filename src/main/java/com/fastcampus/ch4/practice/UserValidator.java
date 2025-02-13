package com.fastcampus.ch4.practice;

import org.apache.catalina.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
//               String id = user.getId();

        ValidationUtils.rejectIfEmpty(errors, "id", "id.required");
        ValidationUtils.rejectIfEmpty(errors, "pwd", "pwd.required");

//        if(id==null || id.length() < 5 || id.length() > 12) {   // id길이 체크
//            errors.rejectValue("id", "id.invalid");
//        }

    }
}
