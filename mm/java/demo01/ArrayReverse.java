package com.example.demo01;

public class ArrayReverse {
    public static void main(String[] args) {
        reverse();
        reverse1();

    }
    public static void reverse(){
        System.out.println("方法1：");
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length/2; i++) {
            int start=arr[i];
            int last=arr[arr.length-1-i];
            //后面的 数字到前面
            arr[i]=last;
            //前面的 数字到后面
            arr[arr.length-1-i]=start;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    public static void reverse1(){
        System.out.println("方法2：");
        int[] arr={1,2,3,4,5,6};
        for (int min=0,max=arr.length-1;min<max;min++,max--){
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
