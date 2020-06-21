package demo01.String;

//[word1#word2#word3]
public class StringPractise {
    public static void main(String[] args) {
        int[] i = {1};
        String result = fromArrayToString(i);
        System.out.println(result);


    }


    public static String fromArrayToString(int[] array) {
        String result = "";
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                result += "word" + array[i] + "#";
                // System.out.print("word" + array[i] +"#" );
            } else {
                result += "word" + array[i] + "]";
                //System.out.print("word" + array[i]+"]");

            }
        }
        return result;

    }
}
