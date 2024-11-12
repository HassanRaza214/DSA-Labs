import java.util.Arrays;

public class ArraySumMeanSplit {
    public static void main(String[] args) {
        double[] numbers = {1.2, 3.4, 5.6, 7.8, 9.0, 11.12, 13.14};

        // Calculate the sum and mean
        double sum = calculateSum(numbers);
        double mean = calculateMean(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);

        // Split the array at index 3 (where 7.8 is located)
        double key = 7.8;
        int splitIndex = findIndex(numbers, key);
        if (splitIndex != -1) {
            double[] firstHalf = Arrays.copyOfRange(numbers, 0, splitIndex);
            double[] secondHalf = Arrays.copyOfRange(numbers, splitIndex, numbers.length);

            System.out.println("First half: " + Arrays.toString(firstHalf));
            System.out.println("Second half: " + Arrays.toString(secondHalf));
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    public static double calculateSum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double calculateMean(double[] numbers) {
        return calculateSum(numbers) / numbers.length;
    }

    public static int findIndex(double[] numbers, double key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1; // Key not found
    }
}