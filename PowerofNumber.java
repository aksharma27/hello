package com.company;

import java.util.Scanner;

public class PowerofNumber {  //USING RECURSION CALCULATE POWER OF A NUMBER
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("enter the power");
        int p=in.nextInt();
        System.out.println(power(n,p));
    }
    static int power(int base, int p){
        if (p<0){
            return -1;
        }
        if (p ==0 ){
            return 1;
        }
        if (p == 1){
            return base;
        }
        return base*power(base, p-1);
    }
}
