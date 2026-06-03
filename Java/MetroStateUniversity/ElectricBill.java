//This program calculates customer's monthly bill
import java.util.Scanner;

public class ElectricBill{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        
        int minutesUsed=0;
        int maxMinute=0;
        int additionalMinute=0;
        double monthlyBill=0;
        
        System.out.print("Enter package: ");
        String userPackage=scanner.nextLine();
        System.out.print("Enter minutes used: ");
        minutesUsed=scanner.nextInt();
        
        if (userPackage.equals("A")){
            maxMinute=450;
            if (minutesUsed<=450){
                monthlyBill=39.99;
            }
            else{
                additionalMinute=minutesUsed - maxMinute;
                monthlyBill=39.99 + (additionalMinute*0.45);
            }
        }
        else if (userPackage.equals("B")){
            maxMinute=900;
            if (minutesUsed<=900){
                monthlyBill=59.99;
            }
            else{
                additionalMinute=minutesUsed - maxMinute;
                monthlyBill=59.99 + (additionalMinute*0.40);
            }
        }
        else if (userPackage.equals("C")){
            monthlyBill=69.99;
        }
        
        System.out.printf("The monthly bill is %.2f.\n", monthlyBill);
        scanner.close();
    }
    
}

/*
Description
A mobile phone service provider has three different subscription packages for its customers.

Package A:

For $39.99 per month, 450 minutes are provided.  
Additional minutes are $0.45 per minute.
Package B:

For $59.99 per month, 900 minutes are provided.
Additional minutes are $0.40 per minute.
Package C:

For $69.99 per month, unlimited minutes are provided.
Write a program that calculates a customer's monthly bill.  It should ask the user to enter the letter of the package the customer has purchased (A, B, or C) and the number of minutes that were used.  The program should display a monthly bill.  You may assume that the user will only enter A, B, or C.  You can use scanner.nextLine() to read the package from the user.

Sample run 1:

Enter package: A
Enter minutes used: 550
The monthly bill is $84.99

Sample run 2:

Enter package: C
Enter minutes used: 1000
The monthly bill is $69.99

Sample run 3:

Enter package: B
Enter minutes used: 100
The monthly bill is $59.99
*/