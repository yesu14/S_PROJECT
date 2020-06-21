package com.example.demo01;

public class ArrayMax {
    public static void main(String[] args) {

        int[] array = new int[]{10, 20, 50, 2000, 40, 5};
        arrayMax(array);
        arrayMin(array);

    }
    public static void arrayMax(int[] arr){
//        int[] array = new int[]{10, 20, 50, 2000, 40, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为 ：" + max);
    }
    public static void arrayMin(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("最小值为："+min);
    }
}
