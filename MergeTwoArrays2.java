import java.util.*;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the number of elements in the first array: ");
        int a1 = scanner.nextInt();
        int[] a = new int[a1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < a1; i++) {
            a[i] = scanner.nextInt();
        }

        // Second array (predefined)
        int[] b = {45, 50, 55, 60, 65};
        int b1 = b.length;

        // Resultant array size
        int c1 = a1 + b1;
        int[] c = new int[c1];

        // Copy elements from the first array to the resultant array
        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }

        // Copy elements from the second array to the resultant array
        for (int i = 0; i < b1; i++) {
            c[a1 + i] = b[i];
        }

        System.out.println("Result = " + Arrays.toString(c));
        
        scanner.close();
    }
}
