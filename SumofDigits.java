package com.company;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        int rem=0;
        int sum=0;
        if (n == 0) {

            return 0;
        }
        if (n<0){
            return -1;
        }
        return n%10 + sum(n/10);
    }
}
