package org.example;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Game mario = new Game(1, "Mario", 1);
        mario.getClass();
        Field[] f = Game.class.getDeclaredFields();
        for(Field field: f){
            System.out.println(field.getClass().getName());
        }
    }
}