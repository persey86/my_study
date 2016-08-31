package com.javarush.test.level05.lesson12.home04;



/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/
// ресурс http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html


import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
        public static void main(String[] args)
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            System.out.println( dateFormat.format( new Date() ) );

            //    System.out.println(new java.util.Date());


            //--- Variant 2
            //   System.out.println(java.util.Calendar.getInstance().getTime());

        }

    }
