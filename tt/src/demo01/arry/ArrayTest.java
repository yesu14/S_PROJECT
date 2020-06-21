package demo01.arry;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] arrayA = new int[5];
//        System.out.println(arrayA);
//
//        int a[] = new int[4];
//        int[] b = {1,2,3};
//        String[] str = {"Hello","a"};
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 100;
        arr2[1] = 200;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.print(""+200);
        System.out.println(arr1[100]);
    }
}
