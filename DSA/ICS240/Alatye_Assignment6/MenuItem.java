import java.text.DecimalFormat;

public class MenuItem implements Comparable<MenuItem>{
    private String name;
    private double price;
    private int quantity;

    //constructor
    public MenuItem(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    //gettre and setter methods
    public String getName(){
        return name;
    }

     public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

     
    // public String toString(){
    //     DecimalFormat df=new DecimalFormat("0.00");
    //     //String output= name +"\t" + "$" + price + "\t" + quantity + "\t" + "$"+(price*quantity);
    //     return String.format("%-12s $%-8s %-5d $%s", name, df.format(price), quantity, + 
    //     df.format(price * quantity));
    // }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        // return String.format("%-12s $%-8s %-5d $%s",
        return String.format("%-18s%10s%6d%10s",
                name, df.format(price), quantity, df.format(price * quantity));
    }

    public boolean equals(MenuItem m) {
        if (this == m) {
            return true;
        }
        if (m == null) {
            return false;
        }
        return this.name.equalsIgnoreCase(m.name)
                && Double.compare(this.price, m.price) == 0;
    }

    @Override
    public int compareTo(MenuItem m) {
        int nameComparison = this.name.compareToIgnoreCase(m.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Double.compare(this.price, m.price);
    }
}