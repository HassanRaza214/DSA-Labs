import java.util.Scanner;

public class SumRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        int sum = calculateSum(N);
        System.out.println("The sum of numbers from 1 to " + N + " is: " + sum);

        scanner.close(); // Close the scanner to prevent resource leak
    }

    public static int calculateSum(int N) {
        if (N <= 0) {
            return 0;
        }
        return N + calculateSum(N - 1);
    }
}
