package Experiment7;
//E7T3
import java.util.Scanner;

class TriangleException extends Exception
    {
        public String toString()
            {
                return " 不能构成三角形!";
            }
    }

class Triangle
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

        public void setSideLength(double lengthX, double lengthY, double lengthZ) throws TriangleException
            {
                this.setLengthX(lengthX);
                this.setLengthY(lengthY);
                this.setLengthZ(lengthZ);
                System.out.print("三个边长 " + getLengthX() + ", " + getLengthY() + ", " + getLengthZ());
                if (getLengthX() + getLengthY() > getLengthZ() && getLengthX() + getLengthZ() > getLengthY() && getLengthY() + getLengthZ() > getLengthX())
                    {
                        //同样是坏习惯，同意懒得改
                    } else
                    {
                        throw new TriangleException();
                    }
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
                return ", 三角形周长：" + perimeter() + ", 面积：" + area();
            }
    }

public class TriangleTest
    {
        public static void main(String[] args)
            {
                Triangle triangle = new Triangle();
                Scanner in = new Scanner(System.in);
                double a, b, c;
                while (true)
                    {
                        System.out.print("请输入三角形的三个边长：");
                        a = in.nextDouble();
                        b = in.nextDouble();
                        c = in.nextDouble();
                        if (a == 0 && b == 0 && c == 0)
                            {
                                System.out.println("# 程序运行结束 #");
                                break;
                            }
                        try
                            {
                                triangle.setSideLength(a, b, c);
                                System.out.println(triangle);
                            } catch (TriangleException e)
                            {
                                System.out.println(e.toString());
                            }
                    }
            }
    }
