package com.kkb.spring.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD
})
@Constraint(validatedBy = MySecondValidation.class)
public @interface StrSize {

    String message() default "test";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int maxStr() default Integer.MAX_VALUE;

    int minStr() default Integer.MIN_VALUE;
}
