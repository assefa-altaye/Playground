package OOP;
import java.util.*;
class Main {


    //randRect(n) that returns an array of rectangle of random height and width
    //between 1 to 10.

//    Rectangle [] rectangles=randRect(n);

    public static Rectangle[] randRect(int n){
        Random random=new Random();
        Rectangle[] rectArray=new Rectangle[n];

        for (int i=0; i<n;i++){
            int height=random.nextInt(10);
            int width=random.nextInt(10);
            int randArea=width*height;
            rectArray[i]=new Rectangle(randArea);
        }
        return rectArray;
    }

    /*
    * // Method to create an array of n random circles
    public static Circle[] randCircle(int n) {
        Circle[] circleArray = new Circle[n];

        for (int i = 0; i < n; i++) {
            double randomRadius = Math.random() * 100;
            circleArray[i] = new Circle(randomRadius);
        }

        return circleArray;
    }*/
    public static void main(String[] args){
        //prompt for the number of rectangles
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many Rectangles? ");
        int n=scanner.nextInt();

        //create an array of random rectangle using randRect()
        Rectangle[] rectangles=randRect(n);
        //print the rectangles

        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

    }
}

/// Sample run:
/// How many rectangles? 10
/// Rect[h=10, w=1] has an area of 10
/// Rect[h=8, w=10] has an area of 80
/// Rect[h=2, w=4] has an area of 8
/// Rect[h=2, w=5] has an area of 10
/// Rect[h=8, w=2] has an area of 16
/// Rect[h=6, w=10] has an area of 60
/// Rect[h=9, w=4] has an area of 36
/// Rect[h=2, w=10] has an area of 20
/// Rect[h=6, w=10] has an area of 60
/// Rect[h=3, w=2] has an area of 6
