package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int strength;
    private String color;

    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int strength){
        this.name = "Vaska";
        this.strength = 10;
    }
    public Dog(String name, int strength, String color){
        this.name = "Vaska";
        this.strength = 10;
        this.color = "red";
        System.out.println(name+color);
    }

    public static void main(String[] args)
    {

    }

}
