package com.holicxxx.demo1;

public class day05_task07 {
    public static void main(String[] args) {
        int[] arr=new int[]{12,14,23,45,66,68,70,77,90,91};
        int[] arr1=new int[10];
        int right =arr.length-1;
        int left =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr1[left]=arr[i];
                left++;
            }else {
                arr1[right]=arr[i];
                right--;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
