package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class FindMinElemCollections
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        Integer min = Collections.min(array);
        return min;
    }
    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(reader.readLine());
        for (int i=0; i<N;i++)
        {
            int M = Integer.parseInt(reader.readLine());
            list.add(M);
        }
        return list;
    }
}
