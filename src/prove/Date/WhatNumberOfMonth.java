package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        result(map(), month);
    }

    public static Map map()
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        return map;
    }

    public static void result(Map<String, Integer> map, String month)
    {
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            if (month.equalsIgnoreCase(pair.getKey()))
            {
                System.out.println(pair.getKey() + " " + "is" + " " + pair.getValue());
                break;
            }
        }
    }
}


/*
------------------ Variant 2 ---------------------------

public static void main(String[] args) throws IOException
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String month = reader.readLine();
    Date resultDate = new Date(month + " 1 1");
    System.out.println(month + " is " + (resultDate.getMonth()+1) + " month");
}

- Bводим имя месяца засовываем его в month
- создаем переменную класса Date и ей
- присваиваем новый экземпляр класса Date с параметрами month + " 1 1",
  то есть формат типа May 1 1 - первое мая 1го года теперь переменна Date имеет именно такую формацию " месяц день год "
- выводим на экран поле переменной resultDate оответствующее месяцу resultDate.getMonth()+1)
- +1 потому что массив отсчет с нуля ведет
 */