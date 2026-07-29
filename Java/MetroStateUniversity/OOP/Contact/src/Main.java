import java.util.*;

public class Main {

    private static Scanner s = new Scanner(System.in);

    /*Support up to 10 contacts*/
    private static final int CAPACITY = 10;

    /* list of contacts */
    private static Contact[] contacts = new Contact[CAPACITY];

    /* current number of contacts*/
    private static int count = 0;


    public static void main(String[] args) {
        loop: while(true){
            System.out.print("A)dd S)earch U)pdate L)ist E)xit:");
            String choice = s.nextLine();
            //call a method to handle the choice
            switch(choice.toUpperCase()){
                case "A":
                    add();
                    break;
                case "S":
                    search();
                    break;
                case "U":
                    update();
                    break;
                case "L":
                    list();
                    break;
                case "E":
                    break loop;
                default:
                    System.out.println("Invalid Choice: " + choice);
            }
        }
    }

    //if contact is full, print "Out of memory"
    //otherwise, prompt for email, first, last name
    //if email does not exist, add contact
    static void add(){
        if(count >= CAPACITY){
            System.out.println("Out of memory");
            return;
        }

        System.out.println("Email: ");
        String email=s.next();
        //I have to check if the email does not exist==>use contains method
        System.out.println("First: ");
        String firstName=s.next();
        System.out.println("Last: ");
        String lastName=s.next();

    }


    static void search(){
        //prompt for email
        //search the list of contacts
        //if found, print the first and last name
        //otherwise, print that email is not found.
    }

    static boolean contains(String email){
        //search for email in the list
        //if found, return true.  otherwise, return false.
        for(int i=0; i<count; i++){
            if(contacts[i].getEmail().equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }
    static void list(){
        //print the list of contacts.
    }

    static void update(){

    }



}