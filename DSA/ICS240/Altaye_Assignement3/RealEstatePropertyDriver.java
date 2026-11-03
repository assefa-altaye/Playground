import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealEstatePropertyDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RealEstatePropertySortedArraySet set = new RealEstatePropertySortedArraySet(50);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                int type = fileScanner.nextInt();
                String propertyType = fileScanner.next();
                Integer bedRooms = fileScanner.nextInt();

                if (type == 1) { // ResidentialProperty
                    Integer garageCapacity = fileScanner.nextInt();
                    set.insert(new ResidentialProperty(propertyType, bedRooms, garageCapacity));
                } else if (type == 2) { // CommercialProperty
                    Boolean hasZoning = fileScanner.nextBoolean();
                    set.insert(new CommercialProperty(propertyType, bedRooms, hasZoning));
                } else if (type == 3) { // RealEstateProperty base
                    set.insert(new RealEstateProperty(propertyType, bedRooms));
                }
            }
            fileScanner.close();

            System.out.println("\n--- Sorted Set Contents (Duplicates Removed) ---");
            System.out.println(set);
            System.out.println("Total items in set: " + set.size());

            // --- TEST CASES ---

            System.out.println("\n================ TEST CASES ================");

            //TEST 1: indexOf
            ResidentialProperty testRes1 = new ResidentialProperty("Apartment", 2, 1);
            RealEstateProperty missingItem = new RealEstateProperty("NonExistent", 99);
            System.out.println("\n--- TEST 1: indexOf ---");
            System.out.println("Index of ('Apartment', 2, garage=1): " + set.indexOf(testRes1));
            System.out.println("Index of ('NonExistent', 99): " + set.indexOf(missingItem));

            //TEST 2: grab
            System.out.println("\n--- TEST 2: grab ---");
            System.out.println("Item at index 0: " + set.grab(0));
            System.out.println("Item at out-of-bounds index 100: " + set.grab(100));

            //TEST 3: categorySet
            System.out.println("\n--- TEST 3: categorySet ---");
            RealEstatePropertySortedArraySet resSet = set.categorySet(1);
            System.out.println("Category 1 (Residential Properties):\n" + resSet);

            RealEstatePropertySortedArraySet commSet = set.categorySet(2);
            System.out.println("\nCategory 2 (Commercial Properties):\n" + commSet);

            RealEstatePropertySortedArraySet invalidSet = set.categorySet(5);
            System.out.println("Category 5 (Invalid category result): " + invalidSet);

            // TEST 4: remove
            System.out.println("\n--- TEST 4: remove ---");
            System.out.println("Removing existing item ('Apartment', 2, garage=1): " + set.remove(testRes1));
            System.out.println("Removing non-existing item: " + set.remove(missingItem));
            System.out.println("\nSet contents after removal:");
            System.out.println(set);
            System.out.println("New total count: " + set.size());

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
        }

        scanner.close();
    }
}