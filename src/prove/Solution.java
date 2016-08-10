package prove;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created on 10.08.2016.
 */
//Make to realize convertor


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter type of foreign currency:");
        String a=sc.readLine();
        System.out.println("Enter name of resault currency:");
        String b=sc.readLine();
        System.out.println("Enter value which you need to calculate:");
        String C=sc.readLine();
        System.out.println("Enter course:");
        String D=sc.readLine();
        System.out.println("If you want to convert, enter '1' or '0' if you want to revert:");
        String X=sc.readLine();
        double c=Double.parseDouble(C);
        double d=Double.parseDouble(D);

        int x=Integer.parseInt(X);
        if (x==1)
        {
            System.out.println("Your resault in" + " " + b + " " + "is:" + convertCtoY(c, d));
        }
            else{
           double  m = c / d;
            System.out.println("Your resault in"+" "+a+" "+"is:"+m);
        }

    }
    public static double convertCtoY(double c, double d)
    {
        double conv = c * d;
        return conv;
    }
}
