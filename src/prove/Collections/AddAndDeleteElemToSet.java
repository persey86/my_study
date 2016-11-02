package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class AddAndDeleteToSetConIterator
{
    public static void main(String[] args)
    {
        System.out.println(createSet());
    }
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<20;i++){
            set.add(i);
        }
        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer digit = iterator.next();
            if (digit>10) iterator.remove();
        }
        return set;
}

    }