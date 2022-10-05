package algorithm;

import java.util.ArrayList;

public class seek {
    public static void main(String[] args) {
        int[] arr =new int[]{1,32,45,67,76,88,88,99,121,222,321};
        int num=88;
//        if (basicSearch(arr,num)){
//            System.out.println("已查找");
//        }else {
//            System.out.println("未找到");
//        }
        if(1==0) {
            int index = binarySearch(arr, num);
            System.out.println(index);
        }
        if(1==1){
            System.out.println(basicSearch1(arr,num));
        }
    }
    //基本查找
    public static boolean basicSearch(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Integer> basicSearch1(int[] arr , int number){
        ArrayList<Integer> array =new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                array.add(i);
            }

        }
        return array;
    }
    //二分查找,要求数列有序
    public static int binarySearch(int[] arr , int number){
        int min =0;
        int max = arr.length-1;
        while (true){
            if(min>max){
                return -1;
            }
            int mid = (min +max)/2;
            if(arr[mid]==number){
                return arr[mid];
            }else if(arr[mid]>number){
                max=mid-1;
                continue;
            }else if(arr[mid]<number){
                min=mid+1;
                continue;
            }
        }

    }
    //插值查找 min+(key-[min]/[max]-[min])*(max-min)=mid要求有序并且均匀分布,重复二分查找的步骤
    //斐波那契查找 0.618分割比列
}
