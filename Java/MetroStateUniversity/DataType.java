//This program calculates total to demonstrate data type input
import java.util.Scanner;

public class DataType {
    
    public static void main(String[] args){
        float subTotal;
        double tax, total;
        
            Scanner scan =new Scanner(System.in);
            System.out.print("Enter price for item 1:");
            float price_1=scan.nextFloat();
            System.out.print("Enter price for item 2:");
            float price_2=scan.nextFloat();
            System.out.print("Enter price for item 3:");
            float price_3=scan.nextFloat();
            
            System.out.println("----------------------");
            System.out.println("Item 1\t= $" +price_1);
            System.out.println("Item 2\t= $" +price_2);
            System.out.println("Item 3\t= $" +price_3);
            System.out.println("----------------------");
            
            subTotal=price_1 + price_2 +price_3;
            System.out.println("Subtotal= $" + subTotal);
            tax=subTotal*0.07;
            System.out.println("Tax \t= $" + tax);
            
            total= subTotal + tax;
            System.out.println("Total \t= $" + total);
        scan.close();   
    }
}

/*
Description:
A customer in a store is purchasing three items.  Write a program that asks for the price of each item, then displays the subtotal of the sale, the amount of sales tax, and the total.  Assume the sales tax is 7 percent.

The data type input from the user is float.

Once the user inputs the prices for the three items, your program will compute subtotal, the tax, and the total.  The subtotal is the sum of total of the prices of the three items.  The tax is computed based on the sales tax of 7 percent. The total is the subtotal plus tax. 

Here are the Java arithmetic operators:

+ addition
- subtraction
* multiplication
/ division
% remainder
Parenthesis can be use to for order of evaluation, for example, (1+2)*2 is 6< and not 5.

Sample run: 

Enter price for item 1:100
Enter price for item 2:200
Enter price for item 3:350

-----------------------
Item 1   = $100.0
Item 2   = $200.0
Item 3   = $350.0
-----------------------
Subtotal = $650.0
Tax      = $45.50000000000001
Total    = $695.5
*/