package fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10;

        long startTime = System.nanoTime();
        long result = fibonacci(n);
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Fibonacci value at position " + n + ": " + result);
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fibPrev = 0;
        long fibCurrent = 1;

        for (int i = 2; i <= n; i++) {
            long fibNext = fibPrev + fibCurrent;
            fibPrev = fibCurrent;
            fibCurrent = fibNext;
        }

        return fibCurrent;
    }
}