package Experiment3;

import java.util.Scanner;

public class T1
{
    public static void main(String[] args)
    {
        String inp = new String();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        inp = in.next();
        String rev = new StringBuilder(inp).reverse().toString();
        if(inp.compareTo(rev) == 0)
        {
            System.out.printf("%s 是回文",inp);
        }
        else
        {
            System.out.printf("%s 不是回文",inp);
        }
    }
}
