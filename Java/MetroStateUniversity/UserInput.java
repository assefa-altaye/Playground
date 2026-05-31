import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
	    //TODO: Your code goes here
	    Scanner scan = new Scanner(System.in);
	    int num1, num2, sum;
	    System.out.println("Sum of two numbers.");
	    System.out.print("Enter first integer : ");
	    num1=scan.nextInt();
	    System.out.print("Enter second integer : ");
	    num2=scan.nextInt();
	    sum = num1 + num2;
	    System.out.printf("The sum is %d.", sum);
	    scan.close();
	}
}

/*
Lab 1.1
Topics

Input using Scanner and nextInt()
Output using System.out.println
Arithmetic operators
Description:

Write a Java program that reads two integers and prints the sum.

Expected Output:

The program below reads the number 5 and 2 and print the result of 5 plus 2.

Sum of two numbers.

Enter first integer : 5
Enter second integer: 2
The sum is 7.
*/