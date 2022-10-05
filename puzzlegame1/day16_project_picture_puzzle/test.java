package com.holicxxx.demo2.day16_project_picture_puzzle;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] tempArr ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r =new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int num =r.nextInt(16);
            int temp=tempArr[num];
            tempArr[num]=tempArr[i];
            tempArr[i]=temp;
        }
        int[][] two_dArr=new int[4][4];
//        int[][] two_dArr=new int[4][4]{};
        int index=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                two_dArr[i][j]=tempArr[index];
                index++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(two_dArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
