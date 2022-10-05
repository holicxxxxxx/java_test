package integerdemo;

import java.util.Scanner;

public class IntegerDemo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");

        String line = sc.nextLine();
        System.out.println(line);
        double v = Double.parseDouble(line);
        System.out.println(v+1);
    }
}
