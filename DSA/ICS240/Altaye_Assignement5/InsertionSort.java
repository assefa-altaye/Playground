
public class InsertionSort extends Sort {
    private int[][] sorted;

    public InsertionSort() {
        super();
        sorted = runAll();
    }

    @Override
    protected String name() {
        return "Insertion";
    }

    @Override
    protected void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}