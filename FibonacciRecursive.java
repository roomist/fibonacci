package fibonacci;

public class FibonacciRecursive {
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
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
