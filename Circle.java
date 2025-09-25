package com.bilinote.toString.exercise;

public class Circle extends GeomerticObject {

    private double radius;

    public Circle(){
        this.color = "white";
        this.weight = 1.0;
        this.radius = 1.0;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }
    public Circle(String color , double weight , double radius){
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return (radius * radius * 3.14);
    }

/*    public boolean equals(Object obj){
        if(obj instanceof Circle){
            if(this.radius == ((Circle) obj).radius){
                return true;
            }
        }
        return false;
    }*/
    public boolean equals(Object obj){
        if(this == obj){
            return true;
            //这里的 this 和 obj 是地址值，指向相同的地址表明是同一个值，所以能返回 true
        }
        if(obj instanceof Circle){
            return (this.radius == ((Circle) obj).radius);
        }
        return false;
    }

    public String toString(){
        return "Circle {radius = " + this.radius +"}";
    }

}
