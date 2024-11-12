import java.util.Arrays;
import java.util.HashSet;

public class MergeArrays {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5, 7, 8};
        int[] array2 = {3, 5, 7, 9, 11};

        // Merge arrays and remove duplicates using a HashSet
        HashSet<Integer> mergedSet = new HashSet<>();
        
        // Add elements from both arrays to the set
        for (int num : array1) {
            mergedSet.add(num);
        }
        for (int num : array2) {
            mergedSet.add(num);
        }

        // Convert the HashSet back to an array
        int[] result = new int[mergedSet.size()];
        int index = 0;
        for (int num : mergedSet) {
            result[index++] = num;
        }

        // Print the merged array
        System.out.println("Merged array without duplicates: " + Arrays.toString(result));
    }
}
