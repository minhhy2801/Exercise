//Exercise 2- Input an integer n, the program will show multiplication table of n (Using String.format) 
package ex2;
import java.util.Scanner;

public class Ex2 
{
    public static String output(int n, int i)
    {
        String s = String.format("%d * %d = %d",n ,i ,n*i );
        return s;
    }

    public static void main(String[] args) 
    {
        int i, input = 0, t;
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
                t = 1;
            }
            catch (Exception ex)
            {
                System.out.print("Please input a number: ");
                t = 0;
                String l = sc.nextLine();
            }
        }
        while ( t == 0);
        for(i=1; i<=10; i++)
        {
            System.out.println(Ex2.output(input, i));
        }
    }   
}
