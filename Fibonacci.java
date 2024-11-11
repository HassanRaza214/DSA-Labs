import java.util.HashMap;

public class Fibonacci {

    // HashMap to store already calculated Fibonacci numbers
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 15; // Calculate the 15th Fibonacci number
        long result = fibonacci(n);
        System.out.println("The " + n + "-th term in the Fibonacci series is: " + result);
    }

    // Method to calculate Fibonacci number with memoization
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: fibonacci(0) = 0, fibonacci(1) = 1
        }

        // Check if the value is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Calculate Fibonacci recursively and store the result in memo
        long value = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, value); // Store the result in the memo HashMap

        return value;
    }
}
