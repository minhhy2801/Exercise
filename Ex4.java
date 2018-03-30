/*
Exercise 4-  Using Two Arrays save information Fullname and mark of Student 
Function 1: Print two arrays with format table (Using String.format)
and add new column Student education 
( Excellent > 9, Good 7.5 -> 9, Rather 6.5 -> 7.5, Normal 5 -> 6.5, Bad < 5) 
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author IMMORTALITY IPOS
 */


public class Ex4 {

    public static String education(double mark){
        String rate;
        if(mark > 9){
            rate = "Excellent";
        }
        else if ( mark > 7.5){
            rate = "Good";
        }
        else if ( mark > 6.5){
            rate = "Rather";
        }
        else if ( mark > 5) {
            rate = "Normal";
        }
        else rate = "Bad";
        return rate;
    }
            
            
            
    public static String output(String name, double mark)
    {
        String s = String.format("%25s %6.2f %s",name ,mark ,education(mark) );
        return s;
    }
    
    public static void main(String[] args) {
        int numOfStudents = 0, i=0, j, flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number student: ");
        do{
        try{
            numOfStudents = sc.nextInt();
            if( numOfStudents <= 0){
                do{
                    System.out.print("Please input positive integer: ");
                    numOfStudents = sc.nextInt();
                }
                while(numOfStudents <= 0);
            }
            flag = 1;
        }
        catch (Exception ex){
            System.out.print("Please input a number: ");
            flag = 0;
            String l = sc.nextLine();
        }
        }
        while( flag == 0);
        String l = sc.nextLine();
        double mark[] = new double[numOfStudents];
        String name[] = new String[numOfStudents];
        do
        {
            System.out.printf("\nHoc sinh thu %d: ",(i+1));
            name[i] = sc.nextLine();
            System.out.print("Diem: ");
            mark[i] = sc.nextDouble();
            String m = sc.nextLine();
            i++;
        }
        while(i<numOfStudents);
        
        for(j=0; j < numOfStudents ; j++)
        {
            System.out.println(Ex4.output(name[j], mark[j]));
        }
    
}
}
