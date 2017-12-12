package com.lab2.Entity.Animals;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NameAnnotation{
    String name() default "NAME";
}