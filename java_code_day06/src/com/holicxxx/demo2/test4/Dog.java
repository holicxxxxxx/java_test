package com.holicxxx.demo2.test4;

public class Dog {
    String color;
    String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.printf("%s的%s正在啃骨头",color,breed);
    }
    public void lookHome(){
        System.out.printf("%s的%s正在看家",color,breed);
    }
}
