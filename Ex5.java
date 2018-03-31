/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;
import java.util.Scanner;

/**
 *
 * @author IMMORTALITY IPOS
 */
public class Ex5 {
    public static class Product {
        private String name;
        private double price;
        private String color;
        private double vat;
        
    public Product(){
        this("Unknown", 0000, "Unknown");
    }
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.color = "Unknown";
    }
    
    public Product(String name, double price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
    
    private void computeVAT(){
        this.vat = this.price * 0.1;
    }
    
    public void  inputProduct(){
        Scanner sc = new Scanner(System.in);
        int flag;
        System.out.print("Input name: ");
        this.name = sc.nextLine();
        System.out.print("Input price: ");
        do
        {
            try
            {
                this.price = sc.nextDouble();
                if( this.price <= 0)
                {
                    do
                    {
                        System.out.print("Please input a positive number( n > 0): "); 
                        this.price = sc.nextDouble();
                    }
                    while(this.price <= 0);
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
    
    public void  printProduct(){
        computeVAT();
        String s = String.format("%25s %10.2f %8s %10.2f",this.name ,this.price ,this.color, this.vat );
        System.out.println(s);
    }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Product prd = new Product();
        prd.inputProduct();
        prd.printProduct();
        
        Product prd1 = new Product("Noi com", 200.5);
        prd1.printProduct();
        
        Product prd2 = new Product();
        prd2.printProduct();
        
        Product prd3 = new Product("Bep dien", 300.5, "Black");
        prd3.printProduct();
    }
    
}
