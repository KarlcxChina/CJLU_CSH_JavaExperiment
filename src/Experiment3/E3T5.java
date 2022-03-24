package Experiment3;

import java.util.Scanner;

public class E3T5
{
    public static void main(String[] args)
    {
            judge();
    }
    public static void judge()
    {
        int inp;
        String inS = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        inp = in.nextInt();
        inS = String.valueOf(inp);
        String rev = new StringBuilder(inS).reverse().toString();
        if(inS.compareTo(rev) == 0)
        {
            System.out.printf("%s is a palindrome number\n\n",inp);
        }
        else
        {
            System.out.printf("%s is NOT a palindrome number\n\n",inp);
        }
    }
}
