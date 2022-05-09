package com.company;

import java.util.Scanner;

public class Gcd {//USING RECURSION TO FIND GCD OF A NUMBER

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();
        System.out.println("Gcd: "+gcd(a,b));
    }
    static int gcd(int a, int b)
    {
        if (a<0 || b <0)
        {
            return -1;
        }
        if (b == 0) {
            return a;
        }
      return gcd(a,a%b);

    }
}
