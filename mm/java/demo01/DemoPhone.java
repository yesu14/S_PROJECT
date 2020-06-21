package com.example.demo01;

public class DemoPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="iphone";
        phone.price=8888;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        phone.call(66401666);
        phone.sendmsg(66401666,"hello");

        Phone phone1=phone;
        phone1.brand="三星";
        phone1.price=5000;
        System.out.println(phone.brand);

        Phone result=getPhone();
        System.out.println(result.brand);


    }
    public static void method(Phone param){
        System.out.println(param.brand);
    }
    /*
    * 方法类型
    * 参数
    * 返回类型*/
    public static Phone getPhone(){
        Phone phone2=new Phone();
        phone2.brand="xiaomi";
        return  phone2;
    }
    /*
    * 方法三要素
    * 1，返回值类型
    * 2.方法名称
    * 3.参数列表*/
}
