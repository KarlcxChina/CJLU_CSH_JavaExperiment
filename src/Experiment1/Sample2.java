package Experiment1;

import java.util.*;
public class Sample2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        final double PI=3.14;
        double r;
        System.out.println("请输入圆的半径：");
        r=in.nextDouble();
        System.out.printf("该圆的半径为：R=%.2f\n",r);
        System.out.printf("该圆的周长为：C=2*%.2f*%.2f=%.2f\n",PI,r,2*PI*r);
        System.out.printf("该圆的面积为：S=%.2f*%.2f*%.2f=%.4f\n",PI,r,r,PI*r*r);
    }
}
