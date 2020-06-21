package demo01;

public class ForTest {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0;i<=100;i++){
//            sum += i;
//        }
//        System.out.println(sum);

//        int sum = 0;
//        int i = 0;
//        do{
//            sum +=i;
//            i++;
//        }while (i<=100);
//        System.out.println(sum);
//        int sum = 5050;
//        int i = 1;
//        while (sum>0){
//            sum -= i;
//            i++;
////            System.out.println(123);
//        }
//        System.out.println(--i);
//        int sum = 0;
//        for(int i =0;i<=100;i=i+2){
//            sum += i;
//        }
//        System.out.println(sum);
        for (int i=0;i<=100;i++){
            if(i>3){
                break;
            }
            System.out.println(i);
        }
    }
}
