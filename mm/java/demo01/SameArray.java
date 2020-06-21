package com.example.demo01;

public class SameArray {
    public static void main(String[] args) {
        int[] arrayA=new int[]{1,2,3};
        int[] arrayB=arrayA;

        arrayB[0]=100;
        arrayB[1]=200;

        System.out.println(""+arrayA[0]+arrayA[1]);
    }
}
