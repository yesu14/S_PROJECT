package com.example.demo01;

public class Phone {
        public String brand;
        public double price;
        public String color;

        public void  call(int num){
            System.out.println("给"+num+"打电话");
        }
        public void  sendmsg(int num,String msg){
            System.out.println("给"+num+"发短信："+msg);
        }

}
