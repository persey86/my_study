package com.javarush.test.level04.lesson16.home02;

import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        System.out.println("Type any three numerals :");
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String A=sc.readLine();
        String B=sc.readLine();
        String C=sc.readLine();
        int a=Integer.parseInt(A);
        int b=Integer.parseInt(B);
        int c=Integer.parseInt(C);

        System.out.println("The middle number between these numerals will be :");
        if (a>b&&b>c)
            System.out.println(b);
        else  if (a>b&&b<c&&a>c)
            System.out.println(c);
        else if (a>b&&b<c&&a<c)
            System.out.println(a);
        else if (a<b&&b<c)
            System.out.println(b);
        else if (a<b&&b>c&&a<c)
            System.out.println(c);
        else
            System.out.println(a);
    }
}
