package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Game mario = new Game(1, "Mario", 1);
        mario.getClass();
        Field[] f = Game.class.getDeclaredFields();
        for(Field field: f){
            System.out.println(field.getClass().getName());
        }

        Object o = new Game(2, "Car race", 1);
        System.out.println(o.getClass().getName());

        Class<?> c = o.getClass();
        Method[] methods = c.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }
}