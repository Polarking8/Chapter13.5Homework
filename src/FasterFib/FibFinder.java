package FasterFib;

public class FibFinder {
    /**
     * Finds the Nth number of the Fibonacci Sequence
     * @param n the number to find in the Fib sequence
     * @return returns the found number
     */
    public static long nthNumberFinder(int n) {
        long[] fibList = new long[(int) (n + 2)];
        int i;
        fibList[0] = 0;
        fibList[1] = 1;
        for (i = 2; i <= n; i++) {
            fibList[i] = fibList[(i - 1)] + fibList[(i - 2)];
        }
        return fibList[(int) n];
    }
}
