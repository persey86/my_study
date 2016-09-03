package prove;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Factorial
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your factorial number");
        String n = sc.readLine();
        int N = Integer.parseInt(n);
        if (N>0){
            int i = 1;
            int k = 1;
            while (k <= N)
            {
                i = i * k;
                k++;
            }
            System.out.println("Resault is: " + i);
        }
            else
            throw new IOException("Inserted Error value of 'n!' ! ");
    }
}
