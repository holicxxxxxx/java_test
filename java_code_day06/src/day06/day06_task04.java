package day06;

import java.util.Scanner;

public class day06_task04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        double num = sc.nextDouble();
        System.out.println(getAbsolute(num));
    }
    public static double getAbsolute(double num){
        if (num<=0){
            return -num;
        }else return num;
    }
}
