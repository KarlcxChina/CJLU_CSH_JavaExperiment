package Experiment3;

import java.util.Scanner;

public class E3T2
{
    public static void main(String[] args)
    {
        int[][] squ = new int[11][11];
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("输入n的值：");
        num = in.nextInt();
        int count = 1;
        for(int i=0;i<Math.floor(num/2);i++)
        {
            for(int j = 0;j<num;j++)
            {
                squ[i*2][j] = count++;
            }
            for(int j = num-1;j>=0;j--)
            {
                squ[i*2+1][j] = count++;
            }
        }
        if (num%2 != 0)
        {
            for(int i=0;i<num;i++)
            {
                squ[num-1][i] = count++;
            }
        }
        for(int i=0;i<num;i++)
        {
            System.out.println();
            for(int j=0;j<num;j++)
            {
                System.out.printf("%3d",squ[i][j]);
            }
        }
    }
}
