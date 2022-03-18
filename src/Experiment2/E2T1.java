package Experiment2;

import java.util.Scanner;

public class E2T1
{
    public static void main(String[] args)
    {
        double a,b,c,s,A;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三角形的三条边长");
        a= in.nextDouble();
        b= in.nextDouble();
        c= in.nextDouble();
        s= (a+b+c)/2;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("三角形的面积为"+A);
    }
}
