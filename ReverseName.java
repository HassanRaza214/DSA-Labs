import java.util.Scanner;

public class ReverseName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        String reversedName = reverse(fullName);
        System.out.println("Reversed Name: " + reversedName);
        
        scanner.close(); // Close the scanner
    }

    public static String reverse(String name) {
        if (name.isEmpty()) {
            return name;
        }
        return reverse(name.substring(1)) + name.charAt(0);
    }
}
