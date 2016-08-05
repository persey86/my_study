package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type, how many dollars would you take on the work, here: ");
        String n=a.readLine();
        String s=("I'll have salary $");
        System.out.println(s+n+" per hour");
    }
}