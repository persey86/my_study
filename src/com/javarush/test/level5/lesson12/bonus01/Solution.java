package com.javarush.test.level05.lesson12.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        String B = reader.readLine();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);

        int sum = (a + b);
        System.out.println("Sum = " + sum);
    }
}
