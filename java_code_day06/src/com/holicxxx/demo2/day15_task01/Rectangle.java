package com.holicxxx.demo2.day15_task01;

public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double perimeter() {
        int length=(this.getLength()+this.getWidth())*2;
        return length;
    }

    @Override
    public double Area() {
        int area=this.getLength()*this.getWidth();
        return area;
    }
}
