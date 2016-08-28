package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String One=sc.readLine();
        String Two=sc.readLine();
        int one=Integer.parseInt(One);
        int two=Integer.parseInt(Two);
        System.out.println(one+two);
    }
}
