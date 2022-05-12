package Experiment7;
//E7T4
class ComplexException extends Exception
    {
        public String toString()
            {
                return "复数 0+0i 不能做除数！";
            }
    }

public class ComplexTest
    {
        public static void main(String[] args)
            {
                Complex c1 = new Complex(1, 2);
                Complex c2 = new Complex(0, 0);
                Complex.outPutResult(c1, c2);
            }
    }

class Complex
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

        public Complex divide(Complex inP) throws ComplexException
            {
                Complex res = new Complex(this);
                if (inP.imagP == 0 && inP.realP == 0)
                    {
                        throw new ComplexException();
                    }
                res.realP =
                        (this.realP * inP.realP + this.imagP * inP.imagP) / (inP.imagP * inP.imagP + inP.realP * inP.realP);
                res.imagP =
                        (this.imagP * inP.realP - inP.imagP * this.realP) / (inP.imagP * inP.imagP + inP.realP * inP.realP);
                return res;
            }

        public void reset(double realIn, double imagIn)
            {
                setRealP(realIn);
                setImagP(imagIn);
            }

        public String outPutComplex()
            {
                if (Double.doubleToLongBits(this.getRealP()) == 0)
                    {
                        if (Double.doubleToLongBits(this.getImagP()) == 0)
                            {
                                return ("0");
                            } else
                            {
                                return (this.getImagP() + "i");
                            }
                    } else
                    {
                        if (Double.doubleToLongBits(this.getImagP()) == 0)
                            {
                                return (String.valueOf(this.getRealP()));
                            } else
                            {
                                if (this.getImagP() > 0)
                                    return (this.getRealP() + "+" + this.getImagP() + "i");
                                else
                                    return (String.valueOf(this.getRealP()) + this.getImagP() + "i");
                            }
                    }
            }

        public static void outPutResult(Complex c1, Complex c2)
            {
                        System.out.println("c1: " + c1.outPutComplex());
                        System.out.println("c2: " + c2.outPutComplex());
                System.out.println("c1+c2 => " + (c1.add(c2)).outPutComplex());
                System.out.println("c1-c2 => " + (c1.subtract(c2)).outPutComplex());
                System.out.println("c1*c2 => " + (c1.multiply(c2)).outPutComplex());
                try
                    {
                        System.out.println("c1/c2 => " + (c1.divide(c2)).outPutComplex());
                    } catch (ComplexException e)
                    {
                        System.out.println(e);
                    }
            }
    }