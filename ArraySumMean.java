import java.util.Arrays;

public class ArraySumMean {
    public static void main(String[] args) {
        double[] numbers = {1.2, 3.4, 5.6, 7.8, 9.0, 11.12, 13.14};

        // Calculate the sum of the elements
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        // Calculate the mean of the elements
        double mean = sum / numbers.length;

        // Print the results
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}