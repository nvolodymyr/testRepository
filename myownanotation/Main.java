	package com.epam.lab5.myownanotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
//2,3,4 завдання
        Notebook notebook = new Notebook();
        Class aClass = notebook.getClass();
        Method[] allmetod=aClass.getDeclaredMethods();
        for(Method method1:allmetod){
            System.out.println("Назва метода "+method1.getName()+"   Тип повернення    "+ method1.getReturnType());
        }
        System.out.println();
        System.out.println("+++++");

        for (Field field : aClass.getDeclaredFields()) {
            MyAnotation myAnotation=field.getAnnotation(MyAnotation.class);
            if (field.isAnnotationPresent(MyAnotation.class)) {
                System.out.println(myAnotation.year()+"  "+myAnotation.os());
                System.out.println(field.getName());
            }

        }
    }
}
