package day06;

import java.util.Scanner;

public class day07_task06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入密码");
        int num = sc.nextInt();
        int[] arr=get_Arr(num);
        reverse(arr);
        sort(arr);

    }
    public static int[] get_Arr(int num){
        int[] arr=new int[length(num)];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i]=encryption(num%10);
            num=num/10;
        }
        return arr;
    }
    public static int length(int num){
        int count=0;
        while (true){
            if(num==0) break;
            else {
                num=num/10;
                count++;
            }
        }
        return count;
    }
    public static int encryption(int num){
        num=(num+5)%10;
        return num;
    }
    public static void reverse(int[] arr){
        String num="";
        for (int i = arr.length - 1; i >= 0; i--) {
            num=num+arr[i]+" ";
        }
        System.out.println(num);
    }
    public static int decryption(int num){
        if(num<=4){
            num=num+10-5;
        }else num=num-5;
        return num;
    }
    public static void sort(int[] arr){
        int[] arr1=new int[arr.length];
        String num ="";
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=decryption(arr[i]);
            num=num+arr1[i];
        }
        System.out.println(num);
    }
}
