
public class RestaurantDriver{

    
    public static void main(String[] args) {
        Order order1 = new Order("12");
        Order order2 = new Order("7");

        System.out.println("=== Empty order checks (order1) ===");
        System.out.println("size(): " + order1.size());
        System.out.println("height(): " + order1.height());
        System.out.println("getTotalQty(): " + order1.getTotalQty());
        System.out.println("search(\"Rice\"): " + order1.search("Rice"));

        MenuItem[] items = {
            new MenuItem("Injera", 2.50, 1),
            new MenuItem("Rice", 1.50, 3),
            new MenuItem("Sambusa", 5.80, 4),
            new MenuItem("Sushi", 8.25, 2),
            new MenuItem("Doro Wat", 12.99, 1),
            new MenuItem("Kitfo", 14.50, 2),
            new MenuItem("Tibs", 11.75, 1),
            new MenuItem("Salad", 6.25, 2),
            new MenuItem("Tea", 2.00, 5),
            new MenuItem("Coffee", 3.25, 4),
            new MenuItem("Baklava", 4.50, 2),
            new MenuItem("Lentil Soup", 5.25, 1),
            new MenuItem("Shiro", 9.75, 2),
            new MenuItem("Fries", 3.95, 3),
            new MenuItem("Burger", 10.50, 1)
        };

        // Order 1 
        for (MenuItem m : items) {
            order1.insert(new MenuItem(m.getName(), m.getPrice(), m.getQuantity()));
        }
        // Order 2: different, non-alphabetical order
        int[] order = {7, 2, 12, 5, 0, 9, 14, 3, 11, 1, 6, 13, 4, 10, 8};
        for (int i : order) {
            MenuItem m = items[i];
            order2.insert(new MenuItem(m.getName(), m.getPrice(), m.getQuantity()));
        }

        System.out.println("\n=== Duplicate insert test (order1) ===");
        System.out.println("Before: " + order1.search("rice"));
        order1.insert(new MenuItem("RICE", 1.50, 2));
        System.out.println("After inserting RICE $1.50 x2: " + order1.search("Rice"));
        System.out.println("size() unchanged: " + order1.size());
        order1.insert(new MenuItem("Rice", 1.75, 1));
        System.out.println("Same name, different price adds a new node, size(): " + order1.size());

        report("Order 1 (table 12)", order1);
        report("Order 2 (table 7)", order2);

        System.out.println("\n=== search tests (order2) ===");
        System.out.println("search(\"Kitfo\"): " + order2.search("Kitfo"));
        System.out.println("search(\"burger\"): " + order2.search("burger"));
        System.out.println("search(\"Pizza\"): " + order2.search("Pizza"));

        System.out.println("\n=== tax / tip tests (order2) ===");
        System.out.printf("getTax(10.5): %.2f%n", order2.getTax(10.5));
        System.out.printf("getTip(18.5): %.2f%n", order2.getTip(18.5));

        System.out.println("\n=== MenuItem tests ===");
        MenuItem a = new MenuItem("Rice", 1.50, 3);
        MenuItem b = new MenuItem("rice", 1.50, 9);
        MenuItem c = new MenuItem("Rice", 2.00, 3);
        System.out.println("a.equals(b) (case/qty ignored): " + a.equals(b));
        System.out.println("a.equals(c) (price differs): " + a.equals(c));
        System.out.println("a.compareTo(b): " + a.compareTo(b));
        System.out.println("a.compareTo(c): " + a.compareTo(c));
        System.out.println("a.compareTo(Sushi): " + a.compareTo(new MenuItem("Sushi", 8.25, 1)));

        System.out.println("\n=== Printed orders ===");
        System.out.println(order1);
        System.out.println(order2);
    }

    private static void report(String label, Order o) {
        System.out.println("\n########## " + label + " ##########");
        System.out.println("size(): " + o.size());
        System.out.println("height(): " + o.height());
        System.out.println("getTotalQty(): " + o.getTotalQty());
        System.out.printf("getTotalBeforeTaxAndTip(): %.2f%n", o.getTotalBeforeTaxAndTip());
        System.out.println("--- preorder ---");
        o.preorder();
        System.out.println("--- inorder ---");
        o.inorder();
        System.out.println("--- postorder ---");
        o.postorder();
    }
}