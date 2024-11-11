import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double absoluteValue = Math.abs(number);
        double squareRoot = Math.sqrt(number);
        double power = Math.pow(number, 2);

        System.out.println("Absolute Value: " + absoluteValue);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power (number^2): " + power);
    }
}
