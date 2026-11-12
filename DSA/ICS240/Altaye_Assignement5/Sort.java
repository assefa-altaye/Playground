import java.util.Random;

public abstract class Sort {
    public static final int TEST = 20;
    public static final int SMALLEST = 20000;
    public static final int TIMING_ROWS = 10;
    public static final long SEED = 42;
    protected static int[][] initial;

    public Stopwatch sw;

    public Sort() {
        sw = new Stopwatch();
        if (initial == null) { 
            Random r = new Random(SEED);
            initial = new int[TIMING_ROWS + 1][];
            initial[0] = new int[TEST];
            for (int i = 1; i <= TIMING_ROWS; i++) {
                initial[i] = new int[SMALLEST * i];
            }
            for (int[] row : initial) {
                for (int j = 0; j < row.length; j++) {
                    row[j] = r.nextInt();
                }
            }
        }
    }

    public static int show(int[] a) {
        for (int v : a) {
            System.out.printf("%20d%n", v);
        }
        return a.length;
    }

    public boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) return false;
        }
        return true;
    }

    protected abstract void sort(int[] a);
    protected abstract String name();
    protected int[][] runAll() {
        int[][] sorted = new int[initial.length][];
        for (int i = 0; i < initial.length; i++) {
            sorted[i] = new int[initial[i].length];
            System.arraycopy(initial[i], 0, sorted[i], 0, initial[i].length);
        }
        System.out.println("Initial Test Array");
        show(sorted[0]);
        sort(sorted[0]);
        System.out.println();
        System.out.println(name() + " Sorted Test Array");
        show(sorted[0]);
        if (!isSorted(sorted[0])) {
            System.out.println("ERROR: test array not sorted!");
        }
        for (int i = 1; i < sorted.length; i++) {
            sw.startTimer();
            sort(sorted[i]);
            sw.stopTimer();
            System.out.println();
            System.out.println("Elapsed time to " + name() + " sort " + sorted[i].length
                    + " ints = " + sw.elapsedTime() + " ms.");
            if (!isSorted(sorted[i])) {
                System.out.println("ERROR: array of " + sorted[i].length + " ints not sorted!");
            }
        }
        System.out.println();
        return sorted;
    }
}