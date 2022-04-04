package Experiment5;
//E5T1
class Rectangle
    {
        private double length, width;

        Rectangle()
            {
            }

        Rectangle(double l, double w)
            {
                length = l;
                width = w;
            }

        public void setLength(double l)
            {
                length = l;
            }

        public void setWidth(double w)
            {
                width = w;
            }

        public double getLength()
            {
                return length;
            }

        public double getWidth()
            {
                return width;
            }

        public double area()
            {
                return length * width;
            }

        public double perimeter()
            {
                return (length + width) * 2;
            }

        public void showMe()
            {
                System.out.print("矩形: 长 " + length + ", 宽 " + width);
                System.out.println(", 周长 " + perimeter() + ", 面积 " + area());
            }
    }

class Cuboid extends Rectangle
    {
        private double field;

        Cuboid()
            {
            }

        Cuboid(double l, double w, double f)
            {
                setLength(l);
                setWidth(w);
                setHeight(f);
            }

        public void setHeight(double f)
            {
                field = f;
            }

        public double getHeight()
            {
                return field;
            }

        public double area()
            {
                return 2*(super.area()+getHeight()*(getLength()+getWidth()));
            }

        public double volume()
            {
                return super.area()*getHeight();
            }

        public void showMe()
            {
                System.out.print("长方体: 长 " + getLength() + ", 宽 " + getWidth()+ ", 高 " + getHeight());
                System.out.println(", 表面积 " + area()+ ", 体积 " + volume());
            }
    }

public class CuboidTest
    {
        public static void main(String[] args)
            {
                Cuboid c1 = new Cuboid(5.0, 6.0, 7.0);
                Rectangle r1= new Rectangle(5,6);
                r1.showMe();
                c1.showMe();
            }
    }
