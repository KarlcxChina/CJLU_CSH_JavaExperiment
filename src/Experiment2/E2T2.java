package Experiment2;

import java.util.Scanner;

public class E2T2
{
    public static void main(String[] args)
    {
        int num, len;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        len = (int)(Math.log(num)/Math.log(10))+1;
        for(int i=0;i<len;i++)
        {
            System.out.println((int)(num%(pow(10,len-i))));
        }
    }
    public static int pow(int a,int b)
    {
        int res = 1;
        for(int i =0;i<b;i++)
        {
            res *= a;
        }
        return res;
    }
}
