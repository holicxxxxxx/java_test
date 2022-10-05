package day06;

import java.util.Scanner;

public class day06_task01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num01=sc.nextInt();
        int num02=sc.nextInt();
        System.out.println(maxNum(num01,num02));

    }
    public static double maxNum(double num01,double num02){
        if(num01>num02)return num02;
        else return num01;
    }
}
