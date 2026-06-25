import java.util.*;

public class Main
{

    /**
     * print array as a table of columns
     * @param a the array
     * @param ncol the number of columns
     */
    static void print(int[] a, int ncol){
        for(int i=0; i<a.length-1; i++)
            System.out.printf((i+1)%ncol==0 ? "%4d\n": "%4d ", a[i]);
        System.out.printf("%4d\n", a[a.length-1]);
    }

    /**
     * return an array of given size of rand integers betwen 1 and 100
     * @param size the size of the array
     * @return the array filled with randon integers
     */
    static int[] randArray(int size){
        int[] a = new int[size];
        for(int i=0; i<a.length; i++)
            // Added + 1 to properly get numbers between 1 and 100 inclusive
            a[i] = (int)(Math.random() * 100) + 1;
        return a;
    }

    /**
     * return the min value in an array
     * @param a the array
     * @return the min value a
     */
    static int min(int[] a){
        int minValue = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < minValue) {
                minValue = a[i];
            }
        }
        return minValue;
    }

    /**
     * return the max value in an array
     * @param a the array
     * @return the max value in a
     */
    static int max(int[] a){
        int maxValue = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    /*
     * return the count of n found in the array
     * @param the array
     * @param n the value to count
     * @return the count
     */
    static int count(int[] a, int n){
        int currentCount = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == n) {
                currentCount++;
            }
        }
        return currentCount;
    }

    /**
     * Return a sub array of the input array
     * @param a the array
     * @param start beginning index
     * @param end ending index exclusively
     * @return the specified subarray
     */
    static int[] sub(int[] a, int start, int end){
        int length = end - start;
        int[] subarray = new int[length];
        for(int i = 0; i < length; i++) {
            subarray[i] = a[start + i];
        }
        return subarray;
    }


    public static void main(String[] args) {
        int[] a = randArray(100);
        print(a,10);
        System.out.println("min=" + min(a));
        System.out.println("max=" + max(a));
        System.out.println("count for 5=" + count(a, 5));
        System.out.println("count for 1=" + count(a, 1));
        System.out.println(Arrays.toString(sub(a,1,3)));
    }
}