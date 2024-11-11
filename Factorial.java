public class Factorial {

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case: n * factorial of (n - 1)
        }
    }
}
