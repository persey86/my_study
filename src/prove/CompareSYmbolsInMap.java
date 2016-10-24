package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class ComparingValuesInLibraryMap
{
        public static HashMap<String, String> createMap ()
        {
            HashMap<String, String> map = new HashMap<String, String>();
            //напишите тут ваш код
            map.put("A", "Oleg");
            map.put("B", "Sasha");
            map.put("C", "Andrey");
            map.put("D", "Kolya");
            map.put("E", "Vasya");
            map.put("F", "Petya");
            map.put("G", "Andrey");
            map.put("H", "Oleg");
            map.put("I", "Sasha");
            map.put("J", "Andrey");
            return map;
        }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;
        for (String tmp : map.values())
        {
            if(name.equals(tmp))
            {
                count++;    // Кол-во совпадений
            }
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {

        return map.containsKey(familiya) ? 1 : 0; // IF function "containsKey" finding concurrency in type "familiya" than method return true
    }
}
