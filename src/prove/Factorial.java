package prove;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Anastasia on 11.08.2016.
 */
public class Factorial
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your factorial");
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
            System.out.print("Resault is: " + i);}
            else{
            System.out.println("Error factorial value, reenter it again! ");
            System.exit(-1);
        }

        }
}
