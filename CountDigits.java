import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
        
        scanner.close(); // Close the scanner to prevent resource leak
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 0; // Base case: when number is 0, return 0
        }
        return 1 + countDigits(number / 10); // Recursive case: count digits by dividing number by 10
    }
}
