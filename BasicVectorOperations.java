import java.util.Vector;

public class BasicVectorOperations {
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> numbers = new Vector<>();

        // Add multiples of 10 to the Vector
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }

        // Display the numbers in the Vector
        System.out.println("Integers in the Vector: " + numbers);

        // Calculate the sum of the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Display the sum
        System.out.println("Sum of integers: " + sum);

        // Find the maximum number in the Vector
        int max = numbers.get(0);  // Start by assuming the first element is the largest
        for (int number : numbers) {
            if (number > max) {
                max = number;  // Update max if a larger number is found
            }
        }

        // Display the maximum number
        System.out.println("Maximum element: " + max);
    }
}
