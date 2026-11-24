import java.text.DecimalFormat;

public class Order {
    private BSTNode root;
    private String tableID;
    private static String restaurantName = "Downtown Cafe";
 
    public Order(String tableID){
        this.tableID=tableID;
        this.root=null;
    }

    //insert menuItem
    public void insert(MenuItem m) {
        if (m == null) {
            return;
        }
        root = insert(root, m);
    }

    private BSTNode insert(BSTNode node, MenuItem m) {
        if (node == null) {
            return new BSTNode(m, null, null);
        }
        int c = m.compareTo(node.getData());
        if (c == 0) {
            node.getData().setQuantity(node.getData().getQuantity() + m.getQuantity());
        } else if (c < 0) {
            node.setLeft(insert(node.getLeft(), m));
        } else {
            node.setRight(insert(node.getRight(), m));
        }
        return node;
    }

    //preorder method prints the preorder traversal of the tree
    public void preorder() {
        preorder(root);
    }

    private void preorder(BSTNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    //inorder prints the inorder traversal of the tree 
    public void inorder() {
        inorder(root);
    }
 
    private void inorder(BSTNode node) {
        if (node == null) {
            return;
        }
        inorder(node.getLeft());
        System.out.println(node.getData());
        inorder(node.getRight());
    }

    //postorder prints the postorder tree
    public void postorder() {
        postorder(root);
    }
 
    private void postorder(BSTNode node) {
        if (node == null) {
            return;
        }
        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.println(node.getData());
    }

    //return the size of the tree, the number of menuItems 
    public int size() {
        return size(root);
    }
    private int size(BSTNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + size(node.getLeft()) + size(node.getRight());
    }

    //return the height of the tree
    public int height() {
        return height(root);
    }
 
    private int height(BSTNode node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }

    //return the sum of qualities
    public int getTotalQty() {
        return getTotalQty(root);
    }
 
    private int getTotalQty(BSTNode node) {
        if (node == null) {
            return 0;
        }
        return node.getData().getQuantity() + getTotalQty(node.getLeft())
                + getTotalQty(node.getRight());
    }

    //Finds the MenuItem whose name matches
    public MenuItem search(String itemName) {
        return search(root, itemName);
    }
 
    private MenuItem search(BSTNode node, String itemName) {
        if (node == null) {
            return null;
        }
        int c = itemName.compareToIgnoreCase(node.getData().getName());
        if (c == 0) {
            return node.getData();
        } else if (c < 0) {
            return search(node.getLeft(), itemName);
        } else {
            return search(node.getRight(), itemName);
        }
    }
    
    //
    public double getTotalBeforeTaxAndTip() {
        return getTotal(root);
    }
 
    private double getTotal(BSTNode node) {
        if (node == null) {
            return 0.0;
        }
        MenuItem m = node.getData();
        return m.getPrice() * m.getQuantity() + getTotal(node.getLeft())
                + getTotal(node.getRight());
    }

    double getTip(double tipPct) {
        return getTotalBeforeTaxAndTip() * tipPct / 100.0;
    }

    double getTax(double taxPct) {
        return getTotalBeforeTaxAndTip() * taxPct / 100.0;
    }

    //toString
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder();
        String line = "--------------------------------------------";

        sb.append(restaurantName).append(" Table ").append(tableID).append("\n");
        sb.append(line).append("\n");
        sb.append(String.format("%-18s%10s%6s%10s%n", "Item", "Price", "Qty", "Total"));
        sb.append(line).append("\n");

        appendItemsInOrder(root, sb);

        double subtotal = getTotalBeforeTaxAndTip();
        double tax = getTax(8.0);
        double tip = getTip(20.0);
        double grandTotal = subtotal + tax + tip;

        sb.append(line).append("\n");
        sb.append(String.format("%34s%10s%n", "Total:", "$" + df.format(subtotal)));
        sb.append(String.format("%34s%10s%n", "Tax (8%):", "$" + df.format(tax)));
        sb.append(String.format("%34s%10s%n", "Tip (20%):", "$" + df.format(tip)));
        sb.append(line).append("\n");
        sb.append(String.format("%34s%10s%n", "Grand total:", "$" + df.format(grandTotal)));

        //left align the total
        //sb.append(line).append("\n");
        // sb.append(String.format("Total:\t\t$%7s%n", df.format(subtotal)));
        // sb.append(String.format("Tax:\t\t$%7s%n", df.format(tax)));
        // sb.append(String.format("Tip:\t\t$%7s%n", df.format(tip)));
        // sb.append(line).append("\n");
        // sb.append(String.format("Grand total: \t$%7s%n", df.format(grandTotal)));
        
        return sb.toString();
    }

    private void appendItemsInOrder(BSTNode current, StringBuilder sb) {
        if (current == null) {
            return;
        }
        appendItemsInOrder(current.getLeft(), sb);
        sb.append(current.getData().toString()).append("\n");
        appendItemsInOrder(current.getRight(), sb);
    }

}
