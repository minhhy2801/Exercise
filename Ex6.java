/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;
import java.util.Scanner;

public class Ex6 {
    public static class Dog {
        private String name;
        private double height;
        private String color;
        
        public void info(){
            Scanner sc = new Scanner(System.in);
            int flag;
            System.out.print("Input name: ");
            this.name = sc.nextLine();
            System.out.print("Input height(cm): ");
            do
            {
                try
                {
                    this.height = sc.nextDouble();
                    if( this.height <= 0)
                    {
                        do
                        {
                            System.out.print("Please input a positive number( n > 0): "); 
                            this.height = sc.nextDouble();
                        }
                        while(this.height <= 0);
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
            while ( flag == 0);
            String l = sc.nextLine();
            System.out.print("Input color: ");
            this.color = sc.nextLine();
        }
        
        public String output(){
            String s = String.format("%25s %10.2f %8s",this.name ,this.height ,this.color );
            return s;
        }
        
        public void  printInfo(){
        System.out.println(output());
        }   
        
        public Dog(){
            this("Unknown", 00, "Unknown");
        }
        
        public Dog(String name, double height){
            this.name = name;
            this.height = height;
            this.color = "Unknown";
        }
        
        public Dog(String name, double height, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        double height;
        String color;
        
        Dog dg = new Dog();
        dg.info();
        dg.printInfo();
        
        Dog dg1 = new Dog("Alaska", 400.00);
        dg1.printInfo();
        dg1.setColor("White");
        dg1.printInfo();
        
        Dog dg2 = new Dog("Husky", 500.00, "Black");
        dg2.printInfo();
        dg2.setHeight(400.00);
        dg2.setName("Chihuahua");
        dg2.printInfo();
    }
    
}
