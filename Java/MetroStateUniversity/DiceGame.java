// import java.util.Random;
// import java.util.Scanner;
// public class DiceGame {
//     public static void main(String[] args) {
//     Scanner scanner =new Scanner(System.in);
//     Random random =new Random();
//     String banner = """
//                          ____
//                         /'  .\\    _____
//                        /: \\___\\  / .  /\\
//                        \\' / . / /____/..\\
//                         \\/___/  '  '\\  /
//                                  '__'\\/
//         """;
//     System.out.println(banner);
//     System.out.println("You are given $250 to start with\n"+
//                             "You can't play once you are out of money");
//     int balance=250;
//     //Generate two random numbers and print them out.
//     int randomNumber1=random.nextInt(1,7);
//     int randomNumber2=random.nextInt(1,7);
    
//     //Let the user play a single round
//     //Input validation for betAmount
//     int betAmount=-1;
//     boolean isValidDigit=false;


//     while (betAmount<0 || betAmount>balance || !isValidDigit){
//         System.out.print("How much are you betting? ");
//         String input =scanner.next();

//         isValidDigit=true;

       
//         for (int i = 0; i < input.length(); i++) {
//                 if (!Character.isDigit(input.charAt(i))) {
//                     isValidDigit = false; // Found a non-digit character (like 'a' or 'b')
//                     break; // Stop checking the rest of the string
//                 }
//             }

//         if(isValidDigit){
//             betAmount=Integer.parseInt(input);
//             System.out.println(betAmount);
//         }
//     balance-=betAmount;
//     }
    
//     System.out.println(balance);
//     System.out.println("Rolling the dice...");
    
//     //Input validation for sumGuess

//     int sumGuess=-1;
//     boolean isValidSum=false;
//     while (sumGuess<2 || sumGuess>12 || !isValidSum){
//         System.out.print("What is the sum of the two dice? ");
//         String sumInput=scanner.next();

//         isValidSum=true;     
//         for (int i = 0; i < sumInput.length(); i++) {
//                 if (!Character.isDigit(sumInput.charAt(i))) {
//                     isValidSum = false; // Found a non-digit character (like 'a' or 'b')
//                     break; // Stop checking the rest of the string
//                 }
//             }

//         if(isValidSum){
//             sumGuess=Integer.parseInt(sumInput);
//             System.out.println(sumGuess);
//         }else{
//             sumGuess=-1;
//         }
//     }


    
    
    
    //Apply the rules so the balance is updated correctly.
    
    //Let the user play an unlimited number of rounds
    //Prompts user whether to continue
    //Deal with the case when the user is out of money
    //Add file writing
    //Add input validation
//     scanner.close();    
//     }
    
// }

//This program runs a dice game 
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DiceGame{
    public static void main(String [] args) throws IOException{
        //throws IOException;
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        
        //Print the dice banner
        System.out.println("Welcome to Dice Game");
        String banner = "                 ____\n" +
                        "                /'  .\\    _____\n" +
                        "               /: \\___\\  / .  /\\\n" +
                        "               \\' / . / /____/..\\\n" +
                        "                \\/___/  '   '\\  /\n" +
                        "                         '___'\\/\n";

        System.out.println(banner);
        System.out.println("You are given $250 to start with\n"+
                            "You can't play once you are out of money");
        int balance=250;
        //Generate two random numbers and print them out.
        //int randomNumber1=random.nextInt(1,7);
        //int randomNumber2=random.nextInt(1,7);
        
        
        //Let the user play a single round
        int betAmount=-1;
        boolean isValidDigit=false;
        
        while (!isValidDigit || betAmount<0 || betAmount>balance){
            System.out.print("How much are you betting? ");
            String input=scanner.next();
            
            isValidDigit=true;
            
            for (int i=0; i< input.length(); i++){
                if(!Character.isDigit(input.charAt(i))){
                    isValidDigit=false;
                    break;
                }
            }
            
            if (isValidDigit){
                betAmount=Integer.parseInt(input);
            }
        }
        
        //Update balance
       // balance-=betAmount;
        
        System.out.println("Rolling the dice...");
        //Generate two random numbers and print them out.
        int die1=random.nextInt(1,7);
        int die2=random.nextInt(1,7);
        //die1=3;
        //die2=1;
        //Input validation for sumGuess
        int sumGuess=-1;
        boolean isValidSum=false;
        
        while (!isValidSum || sumGuess<2 || sumGuess>12){
            System.out.print("What is the sum of the two dice? ");
            String sumInput=scanner.next();
            
            isValidSum=true;
            
            for (int i=0; i< sumInput.length(); i++){
                if(!Character.isDigit(sumInput.charAt(i))){
                    isValidSum=false;
                    break;
                }
            }
            
            if (isValidSum){
                sumGuess=Integer.parseInt(sumInput);
            }else{
                sumGuess=-1;
            }
        }
        
        System.out.println("Die 1 is "+die1);
        System.out.println("Die 2 is "+die2);
        
        //Apply the rules so the balance is updated correctly.
        int winningAmount=0;
        int lossAmount=0;
        int rollSum=die1+die2;
        if ((sumGuess==rollSum) && (die1==die2)){
            winningAmount=betAmount*4;
            System.out.println("You won $"+winningAmount);
            balance+=winningAmount;
            System.out.println("Your current balance is $"+ balance);
        }else if ((sumGuess==rollSum) && (die1!=die2)){
            winningAmount=betAmount;
            System.out.println("You won $"+winningAmount);
            balance+=winningAmount;
            System.out.println("Your current balance is $"+ balance);
        }else{
            lossAmount=betAmount;
            System.out.println("You lost $"+lossAmount);
            balance-=lossAmount;
            System.out.println("Your current balance is $"+ balance);
        }
        
        //Deal with the case when the user is out of money
        if (balance==0){
            System.out.println("You lost $"+lossAmount);
            System.out.println("Your current balance is $"+ balance);
            System.out.println("Sorry, you are out of money. \nSee you later");
        }
        
        
        //Let the user play an unlimited number of rounds
        //Prompts user whether to continue
        
        //Add file writing
        FileWriter fileWriter=new FileWriter("gameResult.txt", true);
        PrintWriter printWriter=new PrintWriter(fileWriter);
        
        printWriter.println("sum\tguess\tbalance");
        printWriter.println(sumGuess + "\t" + rollSum + "\t" + balance);
        
        scanner.close();
        printWriter.close();
        fileWriter.close();
    }
}


/*
Description
The program:
You will write a simple dice game. The game starts by giving the player $250. The game prompts the player for the amount they want to bet and the sum of two randomly rolled dies. If the player guesses the sum correctly, the player wins some money based on the rules below. If the player guesses wrong, the player loses the bet amount. The game repeats until either the player runs out of money or chooses to stop playing.

Here are the rules for winning and losing.

If the guess matches the sum of the die and the two dies have the same value, the winning is four times the bet. For example, if the player bets $100 and the player guesses four as the sum the first dice is two, and the second dice is two, then the player is awarded $400, which is twice the bet of $100.
If the guess matches the sum of the dice but the two dies have different values, then the winning amount is the same as the bet.
If the player guesses the sum incorrectly, he loses the amount equal to the bet.
Input validation (Optional):

(Optional) Make sure the player does not bet more than they have or a negative amount. If the amount is negative or greater than the amount they have, ask the player to reenter the bet.
(Optional) Make sure number inputs are numbers if the input is not a number, prompt again for input.
(Optional) Make sure the dice guess is between 2 and 12. If the input is not within this range, prompt again for input
(Optional) Make sure the player types Y, y, N, or n when prompted to continue the game. If the player enters anything else, the game should ask the player to reenter the answer.'
Session History
When the program terminates, it should write the history of the game session to a file as below. If the file exists, the file will be overwritten. The history shows that the user played 4 rounds and won three rounds but lost all in the third round as shown 0 in the balance.

       sum     guess   balance
         7         7       350
         7         4       250
         8         8       500
        10         5         0
Hints
Because this program is large, you will want to start out small.  Start with the smallest possible program, make sure it compiles, runs, and is correct.  Then add the next functionality.   Below are the functionality suggest you can build incrementally:

Print the dice banner
Generate two random numbers and print them out.
Let the user play a single round
Apply the rules so the balance is updated correctly.
Let the user play an unlimited number of rounds
Prompts user whether to continue
Deal with the case when the user is out of money
Add file writing
Add input validation

Sample 1: Input Validation
Welcome to Dice Game

     ____
    /'  .\    _____
   /: \___\  / .  /\
   \' / . / /____/..\
    \/___/  '  '\  /
             '__'\/
You are given $250 to start with
You can't play once you are out of money
How much are you betting? -100
How much are you betting? 300
How much are you betting? 100ab
How much are you betting? 100
Rolling the dice...
What is the sum of the two dice? -3
What is the sum of the two dice? 0
What is the sum of the two dice? 1
What is the sum of the two dice? two
What is the sum of the two dice? 13
What is the sum of the two dice? 8
Die 1 is 1
Die 2 is 2
You lost $100
Your current balance is $150
Do you want another game? Y/N: a
Do you want another game? Y/N: b
Do you want another game? Y/N: n
Bye

Sample run 2: Out of money
Welcome to Dice Game

     ____
    /'  .\    _____
   /: \___\  / .  /\
   \' / . / /____/..\
    \/___/  '  '\  /
             '__'\/
You are given $250 to start with
You can't play once you are out of money
How much are you betting? 250
Rolling the dice...
What is the sum of the two dice? 8
Die 1 is 1
Die 2 is 4
You lost $250
Your current balance is $0
Sorry, you are out of money.
See you later.

Sample run 3: Winning
Welcome to Dice Game

     ____
    /'  .\    _____
   /: \___\  / .  /\
   \' / . / /____/..\
    \/___/  '  '\  /
             '__'\/
You are given $250 to start with
You can't play once you are out of money
How much are you betting? 100
Rolling the dice...
What is the sum of the two dice? 10
Die 1 is 5
Die 2 is 5
You won $400
Your current balance is $650
Do you want another game? Y/N: y
How much are you betting? 100
Rolling the dice...
What is the sum of the two dice? 8
Die 1 is 3
Die 2 is 5
You won $100
Your current balance is $750
Do you want another game? Y/N: n
Bye
*/