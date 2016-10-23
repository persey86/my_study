package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

!!!Сравнить время работы ArrayList и LinkedList!!!
*/

public class ComparingArrayAndLinkedLists
{
    public static void main(String[] args) throws Exception
    {
        Date start = new Date();
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        Date dateEnd = new Date();
        int time = (int) (dateEnd.getTime() - start.getTime());
        System.out.println("ArrayList time :" + time);

        // LinkedList
        Date start2 = new Date();
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);

        Date dateEnd1 = new Date();
        int time1 = (int)(dateEnd1.getTime() - start2.getTime());
        System.out.println("LinkedList time :" + time1);
    }

    public static void insert10000(List list)
    {
        //напишите тут ваш код
for (int i=0;i<10000;i++)
    list.add(new Object());
    }

    public static void get10000(List list)
    {
        //напишите тут ваш код
        for (int i=0;i<10000;i++)
            list.get(i);
    }

    public static void set10000(List list)
    {
        //напишите тут ваш код
        for (int i=0;i<10000;i++)
            list.set(i, new Object());
    }

    public static void remove10000(List list)
    {
        //напишите тут ваш код
        for (int i=0;i<10000;i++)
            list.remove(0);
    }
}
