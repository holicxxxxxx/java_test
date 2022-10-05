package com.holicxxx.demo2.day15_task01;

public class Square extends Shape{
    final double pi=3.14;
    double radis;

    public Square() {
    }

    public Square(double radis) {
        this.radis = radis;
    }

    public double getPi() {
        return pi;
    }

    public double getRadis() {
        return radis;
    }

    public void setRadis(double radis) {
        this.radis = radis;
    }

    @Override
    public double perimeter() {
        double girth=pi*radis;
        return girth;
    }

    @Override
    public double Area() {
        double area=pi*radis*radis;
        return area;
    }
}
