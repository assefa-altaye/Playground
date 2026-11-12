import java.util.Arrays;

public class JavaArraySort extends Sort {
    private int[][] sorted;

    public JavaArraySort() {
        super();
        sorted = runAll();
    }

    @Override
    protected String name() {
        return "Java Arrays";
    }

    @Override
    protected void sort(int[] a) {
        Arrays.sort(a);
    }
}