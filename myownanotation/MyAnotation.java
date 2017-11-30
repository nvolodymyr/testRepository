package com.epam.lab5.myownanotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnotation {
    String os() default "win10";
    int year() default 2017;

}
