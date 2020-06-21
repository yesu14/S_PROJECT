package demo01.oop;

public class DemoPhone {
    private String name;
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "Iphone";
        phone.price = 6000d;
        phone.color = "黑色";

        getPhone(phone);

        Phone two = getPhone();
        System.out.println(two.brand);

//        System.out.println("品牌："+phone.brand);
//        System.out.println("价格："+phone.price);
//        System.out.println("颜色："+phone.color);
//        phone.call(110);
//        phone.sendMsg(110,"你好！");
//
//        Phone two = phone;
//        two.brand = "三星";
//        System.out.println(phone.brand);

    }

    /*
    * 方法三要素
    * 返回值类型
    * 方法名称
    * 参数列表
    * */
    public static void getPhone(Phone phone){
        System.out.println(phone.brand);
    }

    public static Phone getPhone(){
        Phone phone = new Phone();
        phone.brand ="华为";
        return phone;
    }

    /*
    * 方法类型
    * 参数
    * 返回类型
    * */

    int num1;

    public int getNun(){

        int num = 34;
        num1 =num;
        return num;
    }




}
