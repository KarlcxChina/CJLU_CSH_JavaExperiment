package Experiment2;

import java.util.Scanner;

public class E2T4 {
    public static void main(String[] args) {
        System.out.println("请输入一个4位数的正整数");
        Scanner in = new Scanner(System.in);
        int numi;
        String num;
        numi=in.nextInt();
        num = String.valueOf(numi);
        char[] sinNum=new char[4];
        for(int i=0;i<4;i++)
        {
            sinNum[i] = num.charAt(i);
            sinNum[i]+=5;
            if ((int)sinNum[i]>(int)'9')
            {
                sinNum[i]-=10;
            }
        }
        System.out.println("加密后的数字为:");
        System.out.print(sinNum[3]);
        System.out.print(sinNum[2]);
        System.out.print(sinNum[1]);
        System.out.print(sinNum[0]);
    }
}