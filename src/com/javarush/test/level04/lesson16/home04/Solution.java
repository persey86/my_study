package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        System.out.println("Enter your name here :");
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String name=sc.readLine();
        System.out.println("Enter your date of birth (year) :");
        String year=sc.readLine();
        System.out.println("Enter your month of birth :");
        String month=sc.readLine();
        System.out.println("Enter your day of birth :");
        String day=sc.readLine();

        System.out.println("My name"+" "+name);
        System.out.println("I was born"+" "+day+"."+month+"."+year);
    }
}
