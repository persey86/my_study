package com.javarush.test.level09.lesson11.home03;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader -а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и
вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) {
        try
        {
            readData();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void readData() throws IOException {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            while(true)
            {
                listInt.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (Exception e)
        {
            for(Integer i : listInt) System.out.println(i);
        }
    }
}
