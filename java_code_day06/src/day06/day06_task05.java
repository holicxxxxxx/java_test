package day06;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class day06_task05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num =sc.nextInt();
        System.out.println(num+"是"+getPlace(num)+"位数字");

    }
    public static int getPlace(int num){
        int count =0;
        while (true){
            if(num!=0){
                num=num/10;
                count++;
            }else return count;
        }
    }
}
