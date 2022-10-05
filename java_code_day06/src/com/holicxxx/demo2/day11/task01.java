package com.holicxxx.demo2.day11;

import java.awt.desktop.PrintFilesEvent;
import java.util.ArrayList;

public class task01 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("aaa");
        array.add("bbb");
        array.add("aaa");
        array.add("aaa");
        array.add("ccc");
        array.add("bbb");
        for (int i = 0; i < array.size(); i++) {
            String str=array.get(i);
            System.out.print(str);
        }
    }
}
