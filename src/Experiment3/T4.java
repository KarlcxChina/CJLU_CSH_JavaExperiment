package Experiment3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class T4
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(Path.of("d:\\number.txt"), StandardCharsets.UTF_8);
    }

    static boolean[] a= new boolean[1];
    public static void setPrimeList(int max)//打素数表
    {
        /*
        * setPrimeList(2147482820);//Max:2147482820
        *  System.out.println(isPrime(27644437));
        * */
        a = Arrays.copyOf(a, max+1);//按照最大值重设数组长度
        for(int i = 2;i<1001;i++)
        {
            if (a[i - 1])
            {
                continue;//如果是和数就跳过
            }
            int j = 2;
            while (i * j < max)//范围内标记
            {
                a[i * j - 1] = true;//能被分解，设为和数
                j++;
            }
        }
    }
    public static boolean isPrime(int num)//依据素数表判断素性
    {
        return !(a[num - 1]);
    }
    public static boolean isEvens(int num)//判断偶数
    {
        return num % 2 == 0;
    }
}
