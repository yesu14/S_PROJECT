package demo01.function;

public class FunctionOverload {
    public static void main(String[] args) {
//        System.out.println(sum(2,4));
//        System.out.println(sum(2,4));
//        System.out.println(sum(1,2,3));
//        System.out.println();
        sum(1,2,3,4,5);
    }

    private static int sum(int a,int b) {
        return a+b;
    }

    private static int sum(int a,int b,int c) {
        return a+b+c;
    }

    private static int sum(int... param){
        int result = 0;
        for (int i = 0; i <param.length ; i++) {
//            result += param[i];
            System.out.println("第"+i+"参数为："+param[i]);
        }
        return result;
    }

}
