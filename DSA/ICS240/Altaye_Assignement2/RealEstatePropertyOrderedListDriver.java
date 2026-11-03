public class RealEstatePropertyOrderedListDriver {
    public static void main(String[] args) {
        System.out.println("Tests start...\n  RealEstatePropertyOrderedList \n ");
        
        // RealEstatePropertyOrderedList list = new RealEstatePropertyOrderedList();

        // // 1. Test size() and add(Item) on empty list
        // System.out.println("\n--- Testing add(Item) & size() ---");
        // System.out.println("Initial size (should be 0): " + list.size());

        // ResidentialProperty p1 = new ResidentialProperty("Apartment", 2, 1);
        // CommercialProperty p2 = new CommercialProperty("Office", 0, true);
        // ResidentialProperty p3 = new ResidentialProperty("Townhouse", 3, 2);

        // list.add(p1);
        // list.add(p2);
        // list.add(p3);

        // System.out.println("Size after adding 3 items (should be 3): " + list.size());

        // // 2. Test display()
        // System.out.println("\n--- Testing display() ---");
        // System.out.println("Displaying current list contents:");
        // list.display();

        // // 3. Test add(int index, Item element) [1-based indexing]
        // System.out.println("\n--- Testing add(int index, Item element) ---");
        // CommercialProperty p4 = new CommercialProperty("Warehouse", 0, false);
        
        // // Add at the head (index 1)
        // list.add(1, p4);
        // System.out.println("After adding 'Warehouse' at index 1 (New size: " + list.size() + "):");
        // list.display();

        // // Add at an arbitrary middle index (e.g., index 3)
        // ResidentialProperty p5 = new ResidentialProperty("Condo", 1, 1);
        // list.add(3, p5);
        // System.out.println("After adding 'Condo' at index 3:");
        // list.display();

        // // Add with an index greater than size (should append to the end)
        // RealEstateProperty p6 = new RealEstateProperty("Land", 0);
        // list.add(100, p6);
        // System.out.println("After adding 'Land' at index 100 (out of bounds, appends to end):");
        // list.display();

        // // 4. Test indexOf(Item target)
        // System.out.println("\n--- Testing indexOf(Item target) ---");
        // System.out.println("Index of p5 ('Condo', 1, 1): " + list.indexOf(p5));
        // RealEstateProperty missingItem = new RealEstateProperty("Castle", 10);
        // System.out.println("Index of non-existent item ('Castle', 10): " + list.indexOf(missingItem));

        // // 5. Test get(int index)
        // System.out.println("\n--- Testing get(int index) ---");
        // System.out.println("Item at index 1: " + list.get(1));
        // System.out.println("Item at index 3: " + list.get(3));
        // System.out.println("Item at out-of-bounds index 0: " + list.get(0));
        // System.out.println("Item at out-of-bounds index 50: " + list.get(50));

        // // 6. Test remove(Item target)
        // System.out.println("\n--- Testing remove(Item target) ---");
        // System.out.println("Removing existing item p2 ('Office', 0, true): " + list.remove(p2));
        // System.out.println("Removing non-existent item: " + list.remove(missingItem));
        // System.out.println("List after removing p2 (Size: " + list.size() + "):");
        // list.display();

        // // 7. Test remove(int index)
        // System.out.println("\n--- Testing remove(int index) ---");
        // System.out.println("Removing item at index 1 (Head): " + list.remove(1));
        // System.out.println("List after removing head (Size: " + list.size() + "):");
        // list.display();

        // System.out.println("Attempting to remove at invalid index 0: " + list.remove(0));
        // System.out.println("Attempting to remove at index 99 (beyond length): " + list.remove(99));

        // System.out.println("\n=== All OrderedList Tests Completed Successfully ===");
    }
}