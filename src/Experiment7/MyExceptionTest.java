package Experiment7;
//E7T2
import java.util.Scanner;

class MyException extends Exception
    {
        MyException(String s)
            {
                System.out.println(s);
            }
    }

public class MyExceptionTest
    {
        public static int multiply(int n1, int n2) throws MyException
            {
                int result;
                result = n1 * n2;
                if (result < -32768 || result > 32767) throw new MyException(n1 + "*" + n2 + "的积超出[-32768,32767]的范围！");
                return result;
            }

        public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                int a = 1,b = 1;
                while (a != 0 || b != 0)
                    {
                        System.out.print("请输入两个整数:");
                        a = in.nextInt();
                        b = in.nextInt();
                        try
                            {
                                System.out.println(a+"*"+b+"="+multiply(a, b));
                            } catch (MyException e)
                            {
                                //坏习惯，但是我懒得改了
                            }
                    }
                System.out.println("输入两个0,程序结束!");
            }
    }
