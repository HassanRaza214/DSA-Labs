public class GCD {

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;
        
        // Find GCD of num1 and num2
        int gcd = findGCD(num1, num2);
        
        // Print the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Recursive method to find GCD using Euclid's algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; // Base case: when b becomes 0, return a as the GCD
        }
        return findGCD(b, a % b); // Recursive case
    }
}
