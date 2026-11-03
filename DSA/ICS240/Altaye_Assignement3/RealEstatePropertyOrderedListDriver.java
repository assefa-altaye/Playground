public class RealEstatePropertyOrderedListDriver {
    public static void main(String[] args) {
                
        RealEstatePropertyOrderedList list = new RealEstatePropertyOrderedList();

        // Test add()-Add 3 Properties on empty list
        System.out.println("\nTesting add(Item) ---");
        System.out.println("Size at the begining of test: " + list.size());

        ResidentialProperty p1 = new ResidentialProperty("Apartment", 2, 1);
        CommercialProperty p2 = new CommercialProperty("Office_Space", 0, true);
        ResidentialProperty p3 = new ResidentialProperty("Townhouse", 3, 2);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println("Size after adding 3 items: " + list.size());

        //Test display()
        System.out.println("\nTesting display() ---");
        System.out.println("Displaying list:");
        list.display();

        // Test add(int index, Item element) 
        System.out.println("\nTesting add(int index, Item element) ---");
        CommercialProperty p4 = new CommercialProperty("Single_Family", 4, false);
        
        // Add at index 1
        list.add(1, p4);
        System.out.println("Adding 'Single_Family' at index 1:");
        list.display();

        // Add at middle index 
        ResidentialProperty p5 = new ResidentialProperty("Condo", 1, 1);
        list.add(3, p5);
        System.out.println("Adding 'Condo' at index 3:");
        list.display();

        // Add with an index greater than size
        RealEstateProperty p6 = new RealEstateProperty("Farm Land", 0);
        list.add(10, p6);
        System.out.println("After adding 'Farm Land' at index 10");
        list.display();


        // Test remove(Item target)
        System.out.println("\nTesting remove(Item target) ---");
        System.out.println("Remove item p2 ('Office_Space', 0, true): " + list.remove(p2));
        System.out.println("List after removing p2 (Size: " + list.size() + "):");
        list.display();

        // Test remove(int index)
        System.out.println("\nTesting remove(int index) ---");
        System.out.println("Removing item at index 1 (Head): " + list.remove(1));
        System.out.println("List after removing head (Size: " + list.size() + "):");
        list.display();

        System.out.println("Remove at invalid index 0: " + list.remove(0));
        System.out.println("Remove at index 50 (beyond the list length): " + list.remove(50));


        // Test indexOf(Item target)
        System.out.println("\nTesting indexOf(Item target) ---");
        System.out.println("Index of p5 ('Condo', 1, 1): " + list.indexOf(p5));
        RealEstateProperty itemNotListed = new RealEstateProperty("Restaurant", 10);
        System.out.println("Index of an item not in the list ('Restaurant', 10): " + list.indexOf(itemNotListed));

        // Test get(int index)
        System.out.println("\nTesting get(int index) ---");
        System.out.println("Item at index 1: " + list.get(1));
        System.out.println("Item at index 3: " + list.get(3));
        System.out.println("Item at index 0 (less than 1): " + list.get(0));
        System.out.println("Item at index 50 (greater than the size of the list): " + list.get(50));

                
    }
}