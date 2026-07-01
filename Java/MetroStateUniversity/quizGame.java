/**
 * This is an integer arithmetic game
 * It lets a user practice simple to complex arithmetic problems
 */

import java.util.*;
import java.io.*;

public class quizGame {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Math Quiz\n");
        System.out.println("How many problems? ");
        int problemSize=scanner.nextInt();


        int count=1;
        int totalAnswer=0;
        while(count<=problemSize){
            System.out.printf("Problem %d: \n", count);

            char op=randOp();
            int left=randInt(-20, 20);
            int right=randInt(-20, 20);

            while(op=='/' && right==0){
                right=randInt(-20, 20);
            }

            System.out.printf("\t %d %c %d =", left, op, right);
            int result=scanner.nextInt();

            int correctAnswer=eval(op, left, right);
            if (result==correctAnswer){
                System.out.println("Yout got it");
                totalAnswer++;
            }
            else{
                System.out.printf("Wrong. It's %d.\n", correctAnswer);
            }
            count++;
        }

        System.out.printf("\nYou got %d out of %d.", totalAnswer,problemSize);

        /*
        char op=randOp();
        int left=randInt(-20, 20);
        int right=randInt(-20, 20);

        //Prevent Division by zero
        while(op=='/' && right==0){
            right=randInt(-20, 20);
        }

        System.out.printf("Problem: %d %c %d\n", left, op, right);

        int result=eval(op, left, right);
        System.out.println(result);
        */

    }
    //generate random operator
    public static char randOp(){
        Random rand=new Random();
        int randomOperator=rand.nextInt(4);

        //map randomOperator (0-3) with (+, -, *,/)
        switch(randomOperator){
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            default:
                return '/';
        }
    }

    //generate random integer between a range or low and high
    public static int randInt(int low, int high){
        Random random=new Random();
        //int randomNumber=random.nextInt((high-low)+1)+low;
        return random.nextInt((high-low)+1)+low;
    }
    //Perform the operation (Evaluate)
    public static int eval(char op, int left, int right){
        int result=0;
        switch(op){
            case '+': result=left+right; break;
            case '-': result=left-right; break;
            case '*': result=left*right; break;
            case '/': result=left/right; break;
        }
        return result;
    }

}