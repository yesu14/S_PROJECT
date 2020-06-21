package demo01;

public class ArrayReturn {
    public static void main(String[] args) {
        int[] result=sum(5,7);
        System.out.println("求和："+result[0]);
        System.out.println("平均："+result[1]);
    }
    public static int[] sum(int a,int b){
        int sum =a+b;
        int pingjun=sum/2;
        int[] arr={sum,pingjun};
        return arr;
    }
}
