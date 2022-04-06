package Experiment5;

//E5T4

import java.util.Scanner;

public class GeometryTest
    {
        public static void main(String[] args)
            {
                Shape shape;
                Scanner in = new Scanner(System.in);
                int input = 0;
                while (true)
                    {
                        System.out.print("输入整数1或2(其他将退出):");
                        input = in.nextInt();
                        if (input == 1)
                            {
                                System.out.print("输入椭圆的长半轴a，短半轴b:");
                                double a, b;
                                a = in.nextDouble();
                                b = in.nextDouble();
                                shape = new Oval(a, b);
                                System.out.println(shape);
                            } else if (input == 2)
                            {
                                System.out.print("分别输入椭球的三个半轴a，b，c的长度:");
                                double a, b, c;
                                a = in.nextDouble();
                                b = in.nextDouble();
                                c = in.nextDouble();
                                shape = new Ellipsoid(a, b, c);
                                System.out.println(shape);
                            } else break;
                    }
                System.out.println("程序运行结束！");
            }
    }

abstract class Shape
    {
        final double PI = 3.1415926535897932384626;

        abstract double area();

        abstract double perimeter();
    }

class Oval extends Shape
    {
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

class Ellipsoid extends Oval
    {
        private double semiSpindle;//半主轴

        Ellipsoid(double a, double b, double c)
            {
                super(a, b);
                setSemiSpindle(c);
            }

        public double getSemiSpindle()
            {
                return semiSpindle;
            }

        public void setSemiSpindle(double semiSpindle)
            {
                this.semiSpindle = semiSpindle;
            }

        public double area()
            {
                return (4.0 / 3) * PI * (getSemiSpindle() * getSemiMinorAxis() + getSemiSpindle() * getSemiMajorAxis() + getSemiMajorAxis() * getSemiMinorAxis());
            }

        public String toString()
            {
                return "椭球：半轴a " + getSemiMajorAxis() + ", 半轴b " + getSemiMinorAxis() + ", 半轴c " + getSemiSpindle() + ", 表面积 " + area();
            }
    }