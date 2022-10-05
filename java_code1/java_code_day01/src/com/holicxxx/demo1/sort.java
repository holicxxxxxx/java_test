package com.holicxxx.demo1;

public class sort {
    public static void main(String[] args) {
        int [] arr =new int[]{1,2,3,4,5};

        for (int j = 0; j < arr.length; j++) {
            int temp = arr[j];
            for (int i = j; i < arr.length; i++) {
                if (temp<arr[i]){
                    arr[j]=arr[i];
                    arr[i]=temp;
                    temp=arr[j];
                }
            }

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
            //System.out.print(arr[k]+' ');

        }
    }
}
