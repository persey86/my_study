package prove;
/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kostya on 30.09.2016.
 */
public class SelectedArrayLists
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(r.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) list.add(array[i]);

        ArrayList<Integer> duble = new ArrayList<Integer>();
        ArrayList<Integer> tripple = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)
            {
                duble.add(x);
            }
            else if (x % 3 == 0)
            {
                tripple.add(x);
            }
            else if (x % 2 == 0 && x % 3 == 0)
            {
                duble.add(x);
                tripple.add(x);
            }
            else if(x % 2 != 0 && x % 3 != 0)
            {
                list1.add(x);
            }

        }
        System.out.println(tripple+" ");
        System.out.println(duble+" ");
        System.out.println(list1+" ");
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
