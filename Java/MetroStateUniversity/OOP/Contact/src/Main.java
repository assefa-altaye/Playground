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
        //System.out.print("A)dd S)earch U)pdate L)ist E)xit:");
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

    static void add(){
        //if contact is full, print "Out of memory"
        //otherwise, prompt for email, first, last name
        //if email does not exist, add contact
        if(count >= CAPACITY){
            System.out.println("Out of memory");
        }
        System.out.print("Email: ");
        String email=s.nextLine();

        if(contains(email)){
            System.out.println("Email already exist!");
            return;
        }
        System.out.print("First: ");
        String firstName=s.nextLine();
        System.out.print("Last: ");
        String lastName=s.nextLine();

        contacts[count]=new Contact(firstName, lastName, email);
        count++;
    }


    static void search(){
        //prompt for email
        System.out.println("Email to search: ");
        //String email=s.nextLine.trim();
        String email=s.next();
        //search the list of contacts
        //if found, print the first and last name
        //otherwise, print that email is not found.
        for(int i=0; i<count; i++){
            if(contacts[i].getEmail().equalsIgnoreCase(email)){
                System.out.println("Found: "+contacts[i].getEmail()+ " "
                        + contacts[i].getFirstName()+ " "+contacts[i].getLastName());
                return;
            }
        }
        System.out.println(email + " NOT FOUND!");

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
        System.out.printf("%-30s %-15s %-15s\n", "EMAIL", "FIRST", "LAST");
        for(int i=0; i<count; i++){
            System.out.printf("%-30s %-15s %-15s\n",
                    contacts[i].getEmail(),
                    contacts[i].getFirstName(),
                    contacts[i].getLastName());
        }
    }

    static void update(){
        System.out.println("Email: ");
        String email=s.next();
        for(int i=0; i<count; i++){
            if(contacts[i].getEmail().equalsIgnoreCase(email)){
                System.out.println("First: ");
                contacts[i].setFristName(s.next());

                System.out.println("Last: ");
                contacts[i].setLastName(s.next());
                return;
            }
        }
        System.out.println("No such email found.");

    }

}