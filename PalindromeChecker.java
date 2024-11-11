import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove any spaces and convert to lowercase for case-insensitive check
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the cleaned input
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check if the cleaned input is equal to its reverse
        if (cleanedInput.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
