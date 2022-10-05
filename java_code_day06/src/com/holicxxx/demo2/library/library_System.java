package com.holicxxx.demo2.library;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class library_System {
    public static void main(String[] args) {
        
        ArrayList<Book> array=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\t\t图书管理系统\t\t");
            System.out.println("\t\t1---增加图书\t\t");
            System.out.println("\t\t2---展示图书\t\t");
            System.out.println("\t\t3---查找图书\t\t");
            System.out.println("\t\t4---删除图书\t\t");
            System.out.println("\t\t5---修改图书\t\t");

            int num =sc.nextInt();

            switch (num){
                case 1->addBook(array);
                case 2->showAllBookInfo(array);
                case 3->showBookInfo(array);
                case 4->deleteBook(array);
                case 5->changeBookInfo(array);
                case 6-> System.exit(0);
                default -> System.out.println("请重新输入");
            }
        }
    }
    public static void addBook(ArrayList<Book> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入id");
        int id =sc.nextInt();
        for (int i = 0; i < array.size(); i++) {
            if(id==array.get(i).getId()){
                System.out.println("请重新输入,id已存在");
                return;
            }
        }
        System.out.println("请输入书名");
        String bookName =sc.next();
        System.out.println("请输入作者");
        String bookEditor =sc.next();
        System.out.println("请输入价格");
        int bookPrice=sc.nextInt();
        Book book=new Book(id,bookName,bookEditor,bookPrice);
        array.add(book);

    }
    public static void showAllBookInfo(ArrayList<Book> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("该书id:%d,书名:%s,作者:%s,价格:%d",array.get(i).getId(),array.get(i).getName(),array.get(i).getEditor(),array.get(i).getPrice());
            System.out.println();
        }

    }
    public static void showBookInfo(ArrayList<Book> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入查询的书名");
        String s =sc.next();
        int count =0;
        for (int i = 0; i < array.size(); i++) {
            if (s.equals(array.get(i).getName())) {
                System.out.printf("该书id:%d,书名:%s,作者:%s,价格:%d", array.get(i).getId(), array.get(i).getName(), array.get(i).getEditor(), array.get(i).getPrice());
                break;
            }
            count++;
        }
        if (count==(array.size())){
            System.out.println("书名不存在,请重新输入!");
        }

    }
    public static void deleteBook(ArrayList<Book> array){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入要删除的书籍id");
        int num=sc.nextInt();
        int count =0;
        for (int i = 0; i < array.size(); i++) {
            if(num==array.get(i).getId()){
                Book temp=array.remove(i);
                System.out.printf("书id:%d,书名:%s,作者:%s,价格:%d已删除成功", temp.getId(), temp.getName(), temp.getEditor(), temp.getPrice());
                //break;
                return;
            }
            //count++;
        }
        //if(count==array.size()){
        System.out.println("未查询到此id");

    }
    public static void changeBookInfo(ArrayList<Book> array){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要修改的书名");
        String name =sc.next();
        int num =0;
        for (int i = 0; i < array.size(); i++) {
            if(name==array.get(i).getName()){
                Book temp=array.get(i);
                System.out.println("请输入新的书名");
                String s=sc.next();
                temp.setName(s);
                System.out.println("请输入新的作者名");
                temp.setEditor(sc.next());
                System.out.println("请输入新的价格");
                temp.setPrice(sc.nextInt());
                System.out.println("更改成功");
                //break;
                return;
            }
            //num++;
        }
/*        if(num==array.size()){
            System.out.println("查无此书");
        }*/
        System.out.println("没有该编号的图书信息");
    }
}
