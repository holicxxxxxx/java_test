package com.holicxxx.demo2.test6;

public class demo6 {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        arr[0]=new Student(1,"张三",23);
        arr[1]=new Student(2,"李四",24);

        Student stu4 = new Student(4, "赵六", 26);
        boolean flag=uniqueness(arr,stu4.getId());
        if(flag){
            int index=getIndex(arr);
            if(index ==arr.length){
                Student[] newArr=new Student[arr.length+1];
                newArr=createNewArr(arr,index,stu4);
                showArr(newArr);
            }else{
                showArr(arr);
            }
        }else System.out.println("请重新输入,重复!");
    }

    public static Student[] createNewArr(Student[] arr,int index,Student stu){
        if(arr.length==index){
            Student[] newArr=new Student[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i]=arr[i];
            }
            newArr[index]=stu;
            return newArr;
        }else {
            arr[index]=stu;
            return arr;
        }

    }
    public static int getIndex(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                count++;
            }else break;
        }
        return count;
    }

    public static boolean uniqueness(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(stu!=null){

                if(arr[i].getId()==id){
                    return false;
                }
            }

        }
        return true;
    }
    public static void showArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getName()+" "+arr[i].getId()+" "+arr[i].getAge());
            }
        }
    }
    public static void deleteArr(Student[] arr,int id){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId()==id){
                arr[i]=null;
                count++;
            }
        }
        if (count>0){
            System.out.printf("删除%d个",count);
        }else {
            System.out.println("查无此数");
        }
    }
    public static void alterAge(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId()==id){
                arr[i].setId(id);
            }
        }
    }
}
//alt +enter分离等式or提示出错为啥
//crtl+alt+v
//crtl+b看源码
//crtl+alt+t包裹
//crtl+n搜索看源码  ctrl+f12????
//alt+左键或者按住鼠标中键 批量删除
