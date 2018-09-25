package com.kkb.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MySecondValidation implements ConstraintValidator<StrSize, String> {

    private StrSize constraintAnnotation;

    @Override
    public void initialize(final StrSize constraintAnnotationParam) {
        this.constraintAnnotation = constraintAnnotationParam;

    }

    @Override
    public boolean isValid(final String valueParam,
                           final ConstraintValidatorContext contextParam) {
        if ((valueParam.length() < this.constraintAnnotation.minStr()) || (valueParam.length() > this.constraintAnnotation.maxStr())) {
            return false;
        }
        return true;
    }

}
