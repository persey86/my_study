package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter 3 digitals throw the button enter:");
        String A = sc.readLine();
        String B = sc.readLine();
        String C = sc.readLine();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        if (a == b && b == c)
        {
            System.out.print(a + " " + b + " " + c);
        } else if (a == b && b != c)
        {
            System.out.print(a + " " + b);
        } else if (a != b && b == c)
        {
            System.out.println(b + " " + c);
        } else if(a==c&&a!=b){
            System.out.println(a+" "+c);
        }
        else {
            System.out.println("Enter corect digitals!");
            System.exit(0);
        }
    }
}


