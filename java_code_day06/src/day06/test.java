package day06;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();//52  索引的范围：0 ~ 51
        //2.添加字母 a - z  A - Z
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));//a - z
            list.add((char) ('A' + i));//A - Z

        }
        for (int i = 0; i < 10; i++) {
            list.add((char)('0'+i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
