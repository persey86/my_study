package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        for (int i=0;i<5;i++){
            String s=reader.readLine();
            list.add(s);
        }
        for (int i=0;i<13;i++){
           String list1= list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,list1);
        }
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
