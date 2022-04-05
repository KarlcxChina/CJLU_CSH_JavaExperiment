package Experiment5;

//E5T4
public class GeometryTest
    {

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

        Oval(double a,double b)
            {
                this.setSemiMajorAxis(a);
                this.setSemiMinorAxis(b);
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
    }

class Ellipsoid extends Oval
    {
        private double semiSpindle;//半主轴

        Ellipsoid(double a, double b,double c)
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
                return 0.75*PI*(getSemiSpindle()*getSemiMinorAxis() + getSemiSpindle()*getSemiMajorAxis()+getSemiMajorAxis()*getSemiMinorAxis());
            }
    }