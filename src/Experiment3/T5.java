package Experiment3;

public class T5
{
    public static void main(String[] args)
    {
        int sum=0,higSc=0,sco;
        int[] numList = {82,74,65,77,52,98,46,67,88,91,73,87,71,91,83,62,79,82,66,72};
        for(int i =0;i<20;i++)
        {
            sco = numList[i];
            sum += sco;
            if (sco>higSc)
            {
                higSc = sco;
            }
        }
        System.out.println("average="+((double)sum/20));
        System.out.print("the highest score="+higSc);
    }
}