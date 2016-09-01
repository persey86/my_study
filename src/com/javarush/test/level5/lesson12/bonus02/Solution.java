package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int m = min1(a, b);
        int n = min2(c, d);
        int z = min3(m, n);
        int minimum = minimum(z, e);

        System.out.println("Minimum = " + minimum);
    }
    private static int min1(int a, int b)
    {
        return a < b ? a : b;
    }
    private static int min2(int c, int d){
        return c<d ? c : d;
    }
    private static int min3(int m, int n){
        return m<n ? m : n;
    }
    private static int minimum(int z, int e){
        return z<e ? z : e;
    }

}
