import java.util.Scanner;

public class EvenOddDigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Integer wrappedNumber = input.nextInt();

        int evenCount = 0, oddCount = 0;
        for (char digit : wrappedNumber.toString().toCharArray()) {
            int num = Character.getNumericValue(digit);
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int unboxedNumber = wrappedNumber;

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
        System.out.println("Unboxed number: " + unboxedNumber);
    }
}
