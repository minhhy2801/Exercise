//Exercise 2- Input an integer n, the program will show multiplication table of n (Using String.format) 
package ex2;
import java.util.Scanner;

public class Ex2 
{
    public static String output(int input, int factor)
    {
        String s = String.format("%d * %d = %d",input ,factor ,input * factor );
        return s;
    }

    public static void main(String[] args) 
    {
        int factor, input = 0, flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        do
        {
            try
            {
                input = sc.nextInt();
                if( input <= 0)
                {
                    do
                    {
                        System.out.print("Please input a positive integer( n >= 1): "); 
                        input = sc.nextInt();
                    }
                    while(input <= 0);
                }
                System.out.println("Multiplication table: ");
                flag = 1;
            }
            catch (Exception ex)
            {
                System.out.print("Please input a number: ");
                flag = 0;
                String l = sc.nextLine();
            }
        }
        while ( flag == 0);
        for(factor=1; factor<=10; factor++)
        {
            System.out.println(Ex2.output(input, factor);
        }
    }   
}
