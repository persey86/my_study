package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int [] a=new int[5];
        int [] b=new int[2];
        int [] c=new int[4];
        int [] d=new int[7];
        int [] e=new int[0];
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        for (int j=0;j<list.size();j++){
            int [] sum = list.get(j);
            for (int i=0;i<sum.length;i++){
                sum[i]=i;
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
