package com.holicxxx.demo2.day10;

import java.util.Scanner;

public class task06_true {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String id = sc.nextLine();
        System.out.println(check(id));
    }

    // 返回值boolean类型，表示是否符合规则。参数列表：需要判断的字符串
    public static boolean check(String id) {
        // 如果传递了空参数，返回false
        if (id == null) {
            return false;
        }
        // 如果是数字0开头，返回false
        if (id.startsWith("0")) {
            return false;
        }
        // 如果不是18位，返回false
        if (id.length() != 18) {
            return false;
        }
        // 遍历判断每一位
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            // 前17位都是数字,最后一位可以是数字或者大写字母X
            if (i == id.length() - 1) { // 最后一位
                if (ch < '0' || ch > '9' && ch != 'X') { // 不是数字或者X
                    return false;
                }
            } else { // 其他位
                if (ch < '0' || ch > '9') { // 不是数字
                    return false;
                }
            }
        }
        // 所有的规则都符合，返回true
        return true;
    }
}
