package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayLambdaDemo3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"aaa","a","aaaaa","aaaaaaaaa"};
        Arrays.sort(arr, (o1, o2)-> o1.length()-o2.length());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
