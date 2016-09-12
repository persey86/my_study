package prove;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Anastasia on 13.09.2016.
 */
public class CopyElemFromArrayToArrays
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
        int mas[] = new int[20];
        int mas1[] = new int[10];
        int mas2[] = new int[10];
        for (int i = 0; i < 20; i++)
        {
            mas[i] = Integer.parseInt(rs.readLine());
        }
        System.arraycopy(mas, 0, mas1, 0, 10);
        System.arraycopy(mas, 10, mas2, 0, 10);
        for(int i = 0; i < mas2.length; i++)
        {
            System.out.println(mas2[i]);
        }
    }
}
