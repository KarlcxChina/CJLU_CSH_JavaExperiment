package Experiment6;

//E6T1
interface ShapeX
    {
        double area();

        double perimeter();
    }

class Rectangle implements ShapeX
    {
        private double length, width;

        public double area()
            {
                return getLength() * getWidth();
            }

        public double perimeter()
            {
                return 2 * (getLength() + getWidth());
            }

        public Rectangle(double length, double width)
            {
                this.setLength(length);
                this.setWidth(width);
            }

        public void setLength(double length)
            {
                this.length = length;
            }

        public double getLength()
            {
                return length;
            }

        public double getWidth()
            {
                return width;
            }

        public void setWidth(double width)
            {
                this.width = width;
            }

        public String toString()
            {
                return "矩形：长" + getLength() + "，宽" + getWidth() + "，周长：" + perimeter() + "，面积：" + area();
            }
    }

class Oval implements ShapeX
    {
        final double PI = 3.1415926535897932384626;
        private double semiMajorAxis;//半长轴
        private double semiMinorAxis;//半短轴

        Oval(double a, double b)
            {
                if (a > b)
                    {
                        this.setSemiMajorAxis(a);
                        this.setSemiMinorAxis(b);
                    } else
                    {
                        this.setSemiMajorAxis(b);
                        this.setSemiMinorAxis(a);
                    }
            }

        public double getSemiMajorAxis()
            {
                return semiMajorAxis;
            }

        public void setSemiMajorAxis(double semiMajorAxis)
            {
                this.semiMajorAxis = semiMajorAxis;
            }

        public double getSemiMinorAxis()
            {
                return semiMinorAxis;
            }

        public void setSemiMinorAxis(double semiMinorAxis)
            {
                this.semiMinorAxis = semiMinorAxis;
            }

        public double area()
            {
                return PI * getSemiMajorAxis() * getSemiMinorAxis();
            }

        public double perimeter()
            {
                return 2 * PI * getSemiMinorAxis() + 4 * (getSemiMajorAxis() - getSemiMinorAxis());
            }

        public String toString()
            {
                return "椭圆：长半轴 " + getSemiMajorAxis() + ", 短半轴 " + getSemiMinorAxis() + ", 周长 " + perimeter() + ", 面积 " + area();
            }
    }

class Triangle implements ShapeX
    {
        private double lengthX, lengthY, lengthZ;

        public double area()
            {
                double p;
                p = (getLengthX() + getLengthY() + getLengthZ()) / 2;
                return Math.sqrt(p * (p - getLengthX()) * (p - getLengthY()) * (p - getLengthZ()));
            }

        public double perimeter()
            {
                return getLengthX() + getLengthY() + getLengthZ();
            }

        public Triangle(double lengthX, double lengthY, double lengthZ)
            {
                this.setLengthX(lengthX);
                this.setLengthY(lengthY);
                this.setLengthZ(lengthZ);
            }

        public void setLengthX(double lengthX)
            {
                this.lengthX = lengthX;
            }

        public double getLengthX()
            {
                return lengthX;
            }

        public void setLengthY(double lengthY)
            {
                this.lengthY = lengthY;
            }

        public double getLengthY()
            {
                return lengthY;
            }

        public void setLengthZ(double lengthZ)
            {
                this.lengthZ = lengthZ;
            }

        public double getLengthZ()
            {
                return lengthZ;
            }

        public String toString()
            {
                return "三角形：边长a" + getLengthX() + "，边长b" + getLengthY() + "，边长c" + getLengthZ() + "，周长：" + perimeter() + "，面积：" + area();
            }
    }

public class ShapeXTest
    {
        public static void main(String[] args)
            {
                Rectangle s = new Rectangle(5, 3);
                System.out.println(s);
                Oval o = new Oval(5, 4);
                System.out.println(o);
                Triangle t = new Triangle(3, 3, 3);
                System.out.println(t);
            }
    }
