import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        // Initialize two arrays of size 4
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        
        // Display original arrays
        System.out.println("Before swap:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        // Swap elements of the arrays
        for (int i = 0; i < 4; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        // Display arrays after swap
        System.out.println("\nAfter swap:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}
