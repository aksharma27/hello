package com.company;

public class Printpairs {
    public static void main(String[] args) {
        Printpairs pairs=new Printpairs();
        int[] arr={1,2,3,4,5,6};
        pairs.printPairs(arr);
    }


     void printPairs(int[] arr){
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++){                       //O(N2)
                System.out.print(arr[j]+","+arr[i]);
            }
        }
    }
}
