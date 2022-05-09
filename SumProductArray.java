package com.company;

public class SumProductArray {
    public static void main(String[] args) {
        SumProductArray sp = new SumProductArray();
        int[] arr={1,2,3,4,5,6,7};
        sp.spArray(arr);
    }
     void spArray(int[] array)
    {
        int sum=0;
        int p=1;
        for (int i =0; i<array.length; i++)
        {
            sum+=array[i];
        }
        for (int i=0; i<array.length; i++)
        {
            p=p*array[i];
        }
        System.out.println("sum: " + sum+" product: "+p);
    }
}
