package Experiment3;

import java.util.Scanner;

public class E3T3
{
    public static void main(String[] args)
    {
        int[][] squ = new int[13][13];
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = in.nextInt();
        squ[0][num-2] = 2;
        squ[0][num-1] = 5;
        squ[num-1][0] = 5;
        squ[num-1][1] = 2;
        for(int i=0;i<num-2;i++)
        {
            squ[i+1][num-3-i] = 2;
            squ[i+1][num-2-i] = 5;
            squ[i+1][num-1-i] = 2;
        }
        for(int i=0;i<num;i++)
        {
            System.out.println();
            for(int j = 0;j<num;j++)
            {
                System.out.printf("%3d",squ[i][j]);
            }
        }
    }
}
