package Experiment2;

public class E2T3
{
    public static void main(String[] args)
    {
        final int FINAL_INT = 91;
        int num = 1 ;
        for(int turn=0;turn < Math.ceil(Math.sqrt(FINAL_INT*2));turn++)
        {
            for(int i = 0;i<turn;i++)
            {
                System.out.printf("%3d",num);
                num++;
            }
            System.out.print("\n");
        }
    }


}
