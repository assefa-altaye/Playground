import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealEstatePropertyTypesListsDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RealEstatePropertyTypesLists typesLists = new RealEstatePropertyTypesLists();

        System.out.print("Enter the File name: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                int type = fileScanner.nextInt();
                String propertyType = fileScanner.next();
                Integer bedRooms = fileScanner.nextInt();

                if (type == 1) { 
                    Integer garageCapacity = fileScanner.nextInt();
                    typesLists.add(new ResidentialProperty(propertyType, bedRooms, garageCapacity));
                } else if (type == 2) { 
                    Boolean hasPermit = fileScanner.nextBoolean();
                    typesLists.add(new CommercialProperty(propertyType, bedRooms, hasPermit));
                }
            }
            fileScanner.close();

            // Display the lists
            System.out.println("\nResidential Property List");
            RealEstatePropertyOrderedList resList = typesLists.getList('a');
            typesLists.display(resList);
            System.out.println("Total Residential Properties: " + typesLists.sizeOf(resList));

            System.out.println("\nCommercial Property List");
            RealEstatePropertyOrderedList commList = typesLists.getList('b');
            typesLists.display(commList);
            System.out.println("Total Commercial Properties: " + typesLists.sizeOf(commList));

            // Test indexOf and get
            System.out.println("\nTest indexOf ---");
            ResidentialProperty testRes = new ResidentialProperty("Apartment", 2, 1);
            CommercialProperty testComm = new CommercialProperty("Office_Space", 0, true);
            System.out.println("Index of Residential ('Apartment', 2, 1): " + typesLists.indexOf(testRes));
            System.out.println("Index of Commercial ('Office_Space', 0, true): " + typesLists.indexOf(testComm));

            System.out.println("\nTest get");
            System.out.println("Item at index 1 from Residential List: " + typesLists.get(resList, 1));
            System.out.println("Item at index 1 from Commercial List: " + typesLists.get(commList, 1));

            // Test cases for add(index, item), remove(Item), and remove(list, index)
            
            System.out.println("\nTest add(index, item)");
            ResidentialProperty newRes = new ResidentialProperty("Estate", 6, 4);
            CommercialProperty newComm = new CommercialProperty("MegaStore", 0, false);

            System.out.println("Adding new Residential at index 1:");
            typesLists.add(1, newRes);
            typesLists.display(resList);

            System.out.println("\nAdding new Commercial at index 2:");
            typesLists.add(2, newComm);
            typesLists.display(commList);

            System.out.println("\nTest remove(Item target)");
            System.out.println("Removing Residential ('Apartment', 2, 1): " + typesLists.remove(testRes));
            typesLists.display(resList);

            System.out.println("\nRemoving Commercial ('Office_Space', 0, true): " + typesLists.remove(testComm));
            typesLists.display(commList);

            System.out.println("\nTest remove(list, index)");
            System.out.println("Removing item at index 1 from Residential List: " + typesLists.remove(resList, 1));
            typesLists.display(resList);

            System.out.println("\nRemoving item at index 1 from Commercial List: " + typesLists.remove(commList, 1));
            typesLists.display(commList);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
        }

        scanner.close();
    }
}