package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<Cat> cats = createCats();
        Iterator<Cat> i = cats.iterator();
            i.next();
            i.remove();

        //напишите тут ваш код. пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat("Vaska"));
        cats.add(new Cat("Murzik"));
        cats.add(new Cat("Pushok"));
        //напишите тут ваш код. пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        for (Cat text: cats){
            System.out.println(text);
        }
    }
public static class Cat{

    public Cat(){

    }

    public Cat(String cats)
    {

    }
}
    // пункт 1
}
