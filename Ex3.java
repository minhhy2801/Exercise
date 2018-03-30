/*
Exercise 3-  Program menu: Array process 
Function 1: Sort and print array 
Function 2: Print min and max value in array 
Function 3: Calculate and print out average of elements divided by 3 
 */
package ex3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author IMMORTALITY IPOS
 */
public class Ex3 {
    public static void function_1(){
        int i = 0, numOfStrings;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number strings of array: ");
        numOfStrings = sc.nextInt();
        String arrayString[] = new String[numOfStrings];
        String l = sc.nextLine();
        do{
            System.out.printf("String %d: ",(i+1));
            arrayString[i] = sc.nextLine();
            i++;
        }
        while(i<numOfStrings);
        Arrays.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
    }
    public static void function_2() {
        int i = 0, numOfStrings;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number strings of array: ");
        numOfStrings = sc.nextInt();
        int arrayNumber[] = new int[numOfStrings];
        do
        {
            System.out.printf("String %d: ",(i+1));
            arrayNumber[i] = sc.nextInt();
            i++;
        }
        while(i<numOfStrings);
        int max = arrayNumber[0];
        for (i = 1; i < arrayNumber.length; i++) 
        {
            if (arrayNumber[i] >= max) 
            {
                max = arrayNumber[i];
            }
        }
        int min = arrayNumber[0];
        for (i = 1; i < arrayNumber.length; i++) 
        {
            if (arrayNumber[i] <= min) 
            {
                min = arrayNumber[i];
            }
        }
        System.out.printf("Min: %d\n", min);
        System.out.println("Max: "+max);
    }
    public static void function_3(){
        int i = 0, numOfStrings, j = 0, cout = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number strings of array: ");
        numOfStrings = sc.nextInt();
        int arrayNumber[] = new int[numOfStrings];
        do
        {
            System.out.printf("String %d: ",(i+1));
            arrayNumber[i] = sc.nextInt();
            i++;
        }
        while(i<numOfStrings);
        
        while(j<arrayNumber.length){
            {
            if ( arrayNumber[j] % 3 == 0)
            {
                average = ((average * cout) + arrayNumber[j])/ (++cout);
            }
            j++;
        }
        }
        System.out.println("Average of numbers divided by 3: "+average);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0, flag;
        System.out.println("1. Sort and print array. ");
        System.out.println("2. Print min and max value in array. ");
        System.out.println("3. Calculate and print out average of elements divided by 3. ");
        System.out.println("4. Exit.");
        System.out.print("Choose a number: ");
        
        do{
            try
            {
                input = sc.nextInt();
                if( input < 1 || input > 4)
                {
                    do
                    {
                        System.out.print("Please input positive integer ( n from 1 to 4): ");
                        input = sc.nextInt();
                    }
                    while(input < 1 || input > 4);
                }
                flag = 1;
            }
            catch (Exception ex)
            {
                System.out.print("Please input a number: ");
                flag = 0;
                String l = sc.nextLine();
            }
         }
        while( flag == 0);
        
        switch(input){
            case 1:
                Ex3.function_1();
                break;
            case 2:
                Ex3.function_2();
                break;
            case 3:
                Ex3.function_3();
                break;
            default:
                System.exit(0);
                break;
                    
        }
        // TODO code application logic here
    }
    
}
