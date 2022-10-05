package com.holicxxx.demo2.test2;

public class GirlFriend {
    String name;
    float height;
    float weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友帮我做饭");
    }
    public void show(){
        System.out.printf("我女朋友叫%s,身高%f厘米,体重%f斤",name,height,weight);
    }
}
