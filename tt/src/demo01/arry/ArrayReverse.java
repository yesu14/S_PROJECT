package demo01.arry;

public class ArrayReverse {

    public static void main(String[] args) {
        reverse();
        reverse2();
        int[] result = sum(2,6);
        System.out.println("和="+result[0]);
        System.out.println("平均="+result[1]);
    }

    private static void reverse() {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length/2; i++) {
            int start = arr[i];
            int last = arr[arr.length-1-i];
            arr[i] = last;
            arr[arr.length-1-i] = start;
        }


        for (int i : arr) {
            System.out.println(i);
        }

    }

    private static void reverse2(){
        System.out.println("方法2");
        int[] arr = {1,2,3,4,5};
        for (int min=0,max=arr.length-1;min<max;min++,max--){
            int temp = arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
        for (int i :arr
             ) {
            System.out.println(i);
        }
    }
    
    private static int[] sum(int a,int b){
        int[] arr = new int[2];
        arr[0]=a+b;
        arr[1] = (a+b)/2;
        return arr;
    }
}
