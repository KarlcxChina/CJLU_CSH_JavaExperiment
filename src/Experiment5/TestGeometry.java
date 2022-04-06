package Experiment5;

//E5T2
public class TestGeometry
    {
        public static void main(String[] args)
            {
                Circle c = new Circle(10);
                System.out.println(c);
                Cylinder cy = new Cylinder(10, 5);
                System.out.println(cy);
            }
    }

class Circle
    {
        final double PI = 3.1415926535897932384626;
        private double radius = 0;

        public Circle()
            {
            }

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
                return (PI * radius * radius);
            }

        public double perimeter()
            {
                return PI * 2 * radius;
            }

        public String toString()
            {
                return "圆: 半径 " + getRadius() + ", 面积" + area() + ", 周长 " + perimeter();
            }
    }

class Cylinder extends Circle
    {
        private double height;

        public Cylinder(double r, double h)
            {
                setRadius(r);
                setHeight(h);
            }

        public double getHeight()
            {
                return height;
            }

        public void setHeight(double height)
            {
                this.height = height;
            }

        public double area()
            {
                return 2 * super.area() + super.perimeter() * getHeight();
            }

        public double volume()
            {
                return super.area() * getHeight();
            }

        public String toString()
            {
                return "圆柱: 底半径 " + getRadius() + ", 高 " + getHeight() + ", 表面积" + area() + ", 体积 " + volume();
            }
    }