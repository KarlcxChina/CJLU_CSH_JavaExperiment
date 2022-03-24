package Experiment4;

import java.util.Scanner;

public class E4T1
{
    public static void main(String[] args)
    {
        new CircleTest();
    }
}
class Circle
{
    final double PI = 3.1415926535897932384626;
    private double radius = 0;
    public Circle(){}
    public Circle(double radiusIn)
    {
        radius = radiusIn;
    }
    public void setRadius(double radiusIn)
    {
        radius = radiusIn;
    }
    public double getRadius()
    {
        return radius;
    }
    public double area()
    {
        return (PI*radius*radius);
    }
    public double perimeter()
    {
        return PI*2*radius;
    }
}
class CircleTest
{
    public CircleTest()
    {
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        Circle circle2 = new Circle(5);
        System.out.println("area:"+ circle1.area()+", perimeter:"+circle1.perimeter()+", diameter:"+circle1.getRadius()*2);
        System.out.println("area:"+ circle2.area()+", perimeter:"+circle2.perimeter()+", diameter:"+circle2.getRadius()*2);
    }
}