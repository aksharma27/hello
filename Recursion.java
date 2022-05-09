package com.company;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int ne= n.nextInt();
        int rec = fib(ne);
        System.out.println(rec);
    }
        static int fib(int n){
        if (n<0){
            return -1;
        }
        if (n==0 || n==1){
            return n;
        }
            return fib(n-1)+fib(n-2);
        }
    }


