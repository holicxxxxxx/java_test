package test_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个整数");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if(num<1||num>100){
                System.out.println("输入越界,重新输入!");
                continue;//开发过程中先写异常再写正常
            }
            list.add(num);//integer类型自动装箱
            if(get_sum(list)>200){
                break;
            }


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static int get_sum(ArrayList<Integer> arr){
        int num =0;
        for (int i = 0; i < arr.size(); i++) {
            Integer temp = arr.get(i);
            num = num +temp;
        }
        return num;
    }
}
