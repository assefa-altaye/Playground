import java.util.*;

public class CheckNumber
{

    /*
      return true if the character c is a digit.  
      '0', '1', '2', '3','4','5','6','7','8', 
      and '9' are digits.
      Estimate time: 5-10 minutes
    */
    
    static boolean isDigit(char c){
        //TO: write code to return true if c is a digit
        //    and false if c is not a digit.
        if (Character.isDigit(c)){
            return true;
        }else{
            return false;    
        }
    }
    
    /*
    Return true if the string s is a number.
    Return false otherwise.
    A string is a number if it contains only digits.  
    Estimate time: 5-20 minutes
    */
    static boolean isNumber(String s){
        //if it is empty string => exit
        if(s.isEmpty()){
            return false;
        }
        
        //TODO: write code to return true if s is a number.
        for (int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
        
    }
    
    /*
    Read any number of string from the user
    and print if the string is a number or not a number.
    Estimate time: 5-15 minutes
    */
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    while(s.hasNext()){
	        String input = s.next();
	        if(isNumber(input)){
	           System.out.println("\""+ input + "\"" + " is a number.");
	        }else{
	            System.out.println("\""+ input + "\"" + " is NOT a number" );
	        }
	        //TODO: check if input is a number.  
	        //      print whether it's a number or not a number.
	        //      see sample run.
	    }
	}
}



/*

Topic: Methods
For this lab, you will write a program that read any number of strings from the keyboard and print if a string is a number or not a number. The user terminates the program by clicking on the stop button.

To check if a string is a number, you would need to loop through each character to see if the character is a digit or not. To access a character in a string, use the charAt(pos) method. For example, if the string str is "5hello3", then str.charAt(0) returns '5' and str.charAt(1) return 'h'.

Looping through a string
The example code below shows how you loop through the characters of the string str, printing each character per line. The method str.length() returns the length of the string. The result is the string is printed vertically. You will use this same idea when checking if a string is a number.
String str = "hello";
for(int i=0; i < str.length(); i++){
  char c = str.charAt(i);
  System.out.println(c);
}
Output from example above:
h
e
l
l
o
Write the following methods

static boolean isDigit(char c) which returns true if c is a digit. A character is a digit if it '0', '1', .., '9'. It return false if c is not a digit.
static boolean isNumber(String str) which returns true if the string str contains only digits.
public static void main(String[] args) which reads a single string input using Scanner.next(). It then print whether each input is a number.
Example of using String.charAt(pos)
Sample run
123
"123" is a number.
a123
"a123" is NOT a number.
123a
"123a" is NOT a number.
1a23
"1a23" is NOT a number.
5 cats jumps over 10 dogs
"5" is a number.
"cats" is NOT a number.
"jumps" is NOT a number.
"over" is NOT a number.
"10" is a number.
"dogs" is NOT a number.
my email is me123@gmail.com
"my" is NOT a number.
"email" is NOT a number.
"is" is NOT a number.
"me123@gmail.com" is NOT a number.*/