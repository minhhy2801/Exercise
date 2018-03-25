//Exercise 1- Input an integer n, the program will show the first n primes 
package ex1;

import java.util.Scanner;

public class Ex1 {
    public static int checkPrimes(int a) {
        int i, h = 0;
        for(i = 1; i < a; i++){            
            if( a % i == 0){
                h++;
            }
        }
        if ( h == 1){
            System.out.printf("%d\n",a);
            return 1;
        }
        else return 0;               
}   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j = 0, input = 0, t;
        System.out.print("Input a number: ");
        //Check Input
        do{
        try{
            input = sc.nextInt();
            if( input < 0){
                do{
                    System.out.print("Please input positive integer: ");
                    input = sc.nextInt();
                }
                while(input < 0);
            }
            System.out.println("Primes list: ");
            t = 1;
        }
        catch (Exception ex){
            System.out.print("Please input a number: ");
            t = 0;
            String l = sc.nextLine();
        }
        }
        while( t == 0);
        for(i = 1; j < input; i++){
           if(Ex1.checkPrimes(i) == 1){
               j++;
           }           
        }
    }
}
