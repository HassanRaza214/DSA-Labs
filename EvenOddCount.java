public class EvenOddCount {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {2, 3, 8, 6, 9, 45, 7};

        // Initialize counters
        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array to count even and odd numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output the result
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
