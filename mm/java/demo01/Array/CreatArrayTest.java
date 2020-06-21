package com.example.demo01.Array;

public class CreatArrayTest {
    public static void main(String[] args) {
        CreatArray[] array = new CreatArray[3];
        CreatArray array1=new CreatArray("QLT",22);
        CreatArray array2=new CreatArray("qxl",12);
        CreatArray array3=new CreatArray("jmy",2);



        array[0]=array1;
        array[1]=array2;
        array[2]=array3;

        System.out.println("用户名:"+array[0].getUsername()+array[0].getUserage());

        array[0].setUsername("tt");
        System.out.println(array[0].getUsername());



    }
}
