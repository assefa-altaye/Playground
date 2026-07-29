import java.util.*;

public class arrays {
    public static void main(String [] args){
////        int[] marks1 =new int [5];
////        int m1=marks1[0]=60;
////        System.out.println(m1);
//        int [] marks= {65, 75, 80, 90, 95};
//        // System.out.println(Arrays.toString(marks));
//        // System.out.println(marks[0]);
////        System.out.println(marks.length);
//        for (int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("Same result using Enhanced for loop");
//        for(int mark: marks){
//            System.out.println(mark);
//        }


    }
   

}








import java.util.*;

public class Main {

    private static Scanner s = new Scanner(System.in);

    /* Support up to 10 contacts */
    private static final int CAPACITY = 10;

    /* col 0 = email, col 1 = first, col 2 = last */
    private static String[][] contacts = new String[CAPACITY][3];

    /* current number of contacts */
    private static int count = 0;

    public static void main(String[] args) {

        loop:
        while (true) {

            System.out.print("A)dd Contact S)Search L)ist E)xit:");
            String choice = s.nextLine();

            switch (choice.toUpperCase()) {

                case "A":
                    add();
                    break;

                case "S":
                    search();
                    break;

                case "L":
                    list();
                    break;

                case "E":
                    break loop;

                default:
                    System.out.println("Invalid choice " + choice);
            }
        }
    }

    static void add() {

        // if contact list is full
        if (count >= contacts.length) {
            System.out.println("Error, no more memory.");
            return;
        }

        System.out.print("Email : ");
        String email = s.nextLine();

        // duplicate email
        if (contains(email)) {
            System.out.println("Email exists already.");
            return;
        }

        System.out.print("First : ");
        String first = s.nextLine();

        System.out.print("Last  : ");
        String last = s.nextLine();

        contacts[count][0] = email;
        contacts[count][1] = first;
        contacts[count][2] = last;

        count++;
    }

    static void search() {

        System.out.print("Email to search: ");
        String email = s.nextLine();

        for (int i = 0; i < count; i++) {

            if (contacts[i][0].equalsIgnoreCase(email)) {

                System.out.println("Found: "
                        + contacts[i][0] + " "
                        + contacts[i][1]);

                return;
            }
        }

        System.out.println(email + " is not found.");
    }

    static boolean contains(String email) {

        for (int i = 0; i < count; i++) {

            if (contacts[i][0].equalsIgnoreCase(email)) {
                return true;
            }
        }

        return false;
    }

    static void list() {

        System.out.printf("%-40s %-20s %-20s%n",
                "EMAIL", "FIRST", "LAST");

        for (int i = 0; i < count; i++) {

            System.out.printf("%-40s %-20s %-20s%n",
                    contacts[i][0],
                    contacts[i][1],
                    contacts[i][2]);
        }
    }
}













