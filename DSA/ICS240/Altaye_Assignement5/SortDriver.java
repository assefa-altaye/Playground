/** Runs every sort over the same shared random data. */
public class SortDriver {
    public static void main(String[] args) {
        new MergeSort();       // O(n log n)
        new InsertionSort();   // O(n^2)
        new JavaArraySort();   // Arrays.sort()
    }
}