package com.javarush.test.level02.lesson02.task02;

/* Вычитание чисел
Реализуй метод public static int subtraction(int a, int b). Метод возвращает результат вычитания из числа a числа b.
*/
public class Solution
{

    public static void main(String[] args) throws Exception
    {
subtraction(10,5);
    }
        public static int subtraction ( int a, int b)
        {
            int c = subtraction(a, b);
            System.out.println(c);
            return c;
        }

    }
