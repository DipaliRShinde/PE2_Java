package com.stackroute.pe2;

import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        Factorial.factorialNumber();
    }

    public static void factorialNumber()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=s.nextInt();
        int fact=1;

        for(int i=1;i<number;i++)
        {

            fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            if(fact>Integer.MAX_VALUE)
            {
                System.out.println("The factorial of "+ i +" is out of range");
                break;
            }

            System.out.println("The factorial of "+ i + " is "+fact);
        }
    }
}
