package com.kkb.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MyValidator implements Validator {

    @Override
    public boolean supports(final Class<?> clazzParam) {
        return true;
    }

    @Override
    public void validate(final Object targetParam,
                         final Errors errorsParam) {
        String stringLoc = (String) targetParam;
        errorsParam.addAllErrors(errorsParam);

    }

}
