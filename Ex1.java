//Nhấn Ctrl + Shift + F để clean code
//Exercise 1- Input an integer n, the program will show the first n primes 
package ex1;

import java.util.Scanner;

public class Ex1
{
    public static int checkPrimes(int a) //đặt tên Hàm sai, a là gì?
	{
        int i, cout = 0; //sai chính tả
        for(i = 1; i < a; i++)
		{
            if( a % i == 0)
			{
                cout++;
            }
        }
        if ( cout == 1)
		{
            System.out.printf("%d\n",a);
            return 1;
        }
        else return 0;                
}   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, j = 0, input = 0, flag;	//tên biến được dùng động từ à?
        System.out.print("Input a number: ");
        //Check Input
        do
        {
            try
            {
                input = sc.nextInt();
                if( input < 0)
				{
                    do
                    {
                        System.out.print("Please input positive integer: ");
                        input = sc.nextInt();
                    }
                    while(input < 0);
                }
                System.out.println("Primes list: ");
                flag = 1;
        	}
			catch (Exception ex)
			{
				System.out.print("Please input a number: ");
				flag = 0;
				String l = sc.nextLine();	//điều thần bí gì đây
			}
        }
        while( flag == 0);
		
        for(i = 1; j < input; i++)	//không hiểu dòng for này
		{
           if(Ex1.checkPrimes(i) == 1)	
		   {
               j++;
           }            
        }
    }
}
