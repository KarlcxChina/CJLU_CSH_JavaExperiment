package Experiment8;
//E8T4
import java.util.Scanner;

interface Computable<T>
    {
        T add(T obj);

        T subtract(T obj);

        T multiply(T obj);

        T divide(T obj);
    }

class Complex implements Computable<Complex>
    {

        double realP;
        double imagP;

        Complex(double realIn, double imagIn)
            {
                setImagP(imagIn);
                setRealP(realIn);
            }

        Complex(Complex Ori)
            {
                setImagP(Ori.imagP);
                setRealP(Ori.realP);
            }

        public double getRealP()
            {
                return realP;
            }

        public void setRealP(double realP)
            {
                this.realP = realP;
            }

        public double getImagP()
            {
                return imagP;
            }

        public void setImagP(double imagP)
            {
                this.imagP = imagP;
            }

        public Complex add(Complex inP)
            {
                Complex res = new Complex(this);
                res.realP += inP.realP;
                res.imagP += inP.imagP;
                return res;
            }

        public Complex subtract(Complex inP)
            {
                Complex res = new Complex(this);
                res.realP -= inP.realP;
                res.imagP -= inP.imagP;
                return res;
            }

        public Complex multiply(Complex inP)
            {
                Complex res = new Complex(this);
                res.realP = this.realP * inP.realP - this.imagP * inP.imagP;
                res.imagP = this.imagP * inP.realP + this.realP * inP.imagP;
                return res;
            }

        public Complex divide(Complex inP)
            {
                Complex res = new Complex(this);
                res.realP = (this.realP * inP.realP + this.imagP * inP.imagP) / (inP.imagP * inP.imagP + inP.realP * inP.realP);
                res.imagP = (this.imagP * inP.realP - inP.imagP * this.realP) / (inP.imagP * inP.imagP + inP.realP * inP.realP);
                return res;
            }

        public void reset(double realIn, double imagIn)
            {
                setRealP(realIn);
                setImagP(imagIn);
            }

        public String toString()
            {
                if (Double.doubleToLongBits(this.getRealP()) == 0)
                    {
                        return (this.getImagP() + "i");
                    } else
                    {
                        if (Double.doubleToLongBits(this.getImagP()) == 0)
                            {
                                return (String.valueOf(this.getRealP()));
                            } else
                            {
                                if (this.getImagP() > 0)
                                    {
                                        return (this.getRealP() + "+" + this.getImagP() + "i");
                                    } else
                                    {
                                        return (String.valueOf(this.getRealP()) + this.getImagP() + "i");
                                    }
                            }
                    }
            }
    }

class Fraction implements Computable<Fraction>
    {
        private int fz, fm; //fz=分子，fm=分母

        Fraction()
            {
            }

        Fraction(int fz, int fm)
            {
                this.fz = fz;
                this.fm = fm;
            }

        public Fraction divide(Fraction f2)
            {
                Fraction fs;
                fs = this.multiply(divideWithOne(f2));
                return fs;
            }

        public Fraction divideWithOne(Fraction fsIn)
            {
                Fraction fs = new Fraction();
                fs.fm = fsIn.fz;
                fs.fz = fsIn.fm;
                return fs;
            }

        public Fraction multiply(Fraction f2)
            {
                Fraction fs = new Fraction();
                fs.setFz(this.fz * f2.fz);
                fs.setFm(this.fm * f2.fm);
                return fs;
            }

        public void setFz(int fz)
            {
                this.fz = fz;
            }

        public void setFm(int fm)
            {
                this.fm = fm;
            }

        public Fraction add(Fraction f1)
            {
                Fraction fs = new Fraction();
                fs.setFz(this.fz * f1.fm + this.fm * f1.fz);
                fs.setFm(this.fm * f1.fm);
                return fs;
            }

        public Fraction subtract(Fraction f1)
            {
                Fraction fs = new Fraction();
                fs.setFz(this.fz * f1.fm - this.fm * f1.fz);
                fs.setFm(this.fm * f1.fm);
                return fs;
            }

        // insert your codes here
        public String toString()
            {
                if (this.fm < 0)
                    {
                        return -1 * this.fz + "/" + -1 * this.fm;
                    }
                return this.fz + "/" + this.fm;
            }
    }

public class MyGenericProgram
    {
        public static void main(String[] args)
            {
                System.out.println("三次复数计算");
                for (int i = 0; i < 3; i++)
                    {
                        Scanner in = new Scanner(System.in);
                        System.out.print("复数1：a+bi，请分别输入a和b：");
                        int a1, b1;
                        a1 = in.nextInt();
                        b1 = in.nextInt();
                        System.out.print("复数2：a+bi，请分别输入a和b：");
                        int a2, b2;
                        a2 = in.nextInt();
                        b2 = in.nextInt();
                        Complex c1 = new Complex(a1, b1);
                        Complex c2 = new Complex(a2, b2);
                        System.out.println("c1：" + c1 + "，c2：" + c2);
                        System.out.println("c1+c2 =>" + c1.add(c2));
                        System.out.println("c1-c2 =>" + c1.subtract(c2));
                        System.out.println("c1*c2 =>" + c1.multiply(c2));
                        System.out.println("c1/c2 =>" + c1.divide(c2));
                    }
                System.out.println();
                System.out.println("三次分数计算");
                for (int i = 0; i < 3; i++)
                    {
                        Scanner in = new Scanner(System.in);
                        System.out.print("分数1：a/b，请分别输入整数a和b：");
                        int a1, b1;
                        a1 = in.nextInt();
                        b1 = in.nextInt();
                        System.out.print("分数2：a/b，请分别输入整数a和b：");
                        int a2, b2;
                        a2 = in.nextInt();
                        b2 = in.nextInt();
                        Fraction c1 = new Fraction(a1, b1);
                        Fraction c2 = new Fraction(a2, b2);
                        System.out.println("f1：" + c1 + "，f2：" + c2);
                        System.out.println("f1+f2 =>" + c1.add(c2));
                        System.out.println("f1-f2 =>" + c1.subtract(c2));
                        System.out.println("f1*f2 =>" + c1.multiply(c2));
                        System.out.println("f1/f2 =>" + c1.divide(c2));
                    }
            }
    }
