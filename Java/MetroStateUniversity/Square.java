//This program prints a table of x and f(x) in a table form

public class Square{
    public static void main(String [] args){
        //Print the header
        System.out.printf("|%6s|%8s|\n", "x", "f(x)");
        System.out.println("-----------------");
        //Print the table data
        for(double x=-5.0; x<=5.0; x +=0.25){
            double fx=Math.sqrt((x*x)+4);
            System.out.printf("%6.2f | %6.2f|\n", x, fx);
        }
        //print the footer
        System.out.println("-----------------");
    }
}

/*
Description
Lab 3.2
Write a program that prints the value x and value of f(x) as a table for the function below.  The value of x starts at -5 and goes up to 5 by an increment of 0.25.  See sample run.  You can compute the square root of a value using Math.sqrt().  For example, to compute the square of 4, it's Math.sqrt(4) which will return 2.0.

f(x)=√(x*x)+4

Sample run:
|     x|  f(x)|
---------------
| -5.00|  5.39|
| -4.75|  5.15|
| -4.50|  4.92|
| -4.25|  4.70|
| -4.00|  4.47|
| -3.75|  4.25|
| -3.50|  4.03|
| -3.25|  3.82|
| -3.00|  3.61|
| -2.75|  3.40|
| -2.50|  3.20|
| -2.25|  3.01|
| -2.00|  2.83|
| -1.75|  2.66|
| -1.50|  2.50|
| -1.25|  2.36|
| -1.00|  2.24|
| -0.75|  2.14|
| -0.50|  2.06|
| -0.25|  2.02|
|  0.00|  2.00|
|  0.25|  2.02|
|  0.50|  2.06|
|  0.75|  2.14|
|  1.00|  2.24|
|  1.25|  2.36|
|  1.50|  2.50|
|  1.75|  2.66|
|  2.00|  2.83|
|  2.25|  3.01|
|  2.50|  3.20|
|  2.75|  3.40|
|  3.00|  3.61|
|  3.25|  3.82|
|  3.50|  4.03|
|  3.75|  4.25|
|  4.00|  4.47|
|  4.25|  4.70|
|  4.50|  4.92|
|  4.75|  5.15|
|  5.00|  5.39|
---------------
*/