import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        // Example input array of distinct integers
        int[] numbers = {2, 3, 6, 7, 8, 9};
        int target = 15;

        // Find all unique combinations that add up to the target
        List<List<Integer>> result = combinationSum(numbers, target);

        // Print the result
        System.out.println("Unique combinations that add up to " + target + ": " + result);
    }

    // Method to find all unique combinations
    public static List<List<Integer>> combinationSum(int[] numbers, int target) {
        // Sort the array to help avoid duplicate combinations
        Arrays.sort(numbers);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(numbers, target, 0, new ArrayList<>(), results);
        return results;
    }

    // Backtracking method
    private static void backtrack(int[] numbers, int target, int start, List<Integer> currentCombination, List<List<Integer>> results) {
        // If target is 0, we found a valid combination
        if (target == 0) {
            results.add(new ArrayList<>(currentCombination));
            return;
        }

        // Explore each number starting from the current position
        for (int i = start; i < numbers.length; i++) {
            // If the current number is greater than the target, break the loop
            if (numbers[i] > target) break;

            // Add the current number to the combination
            currentCombination.add(numbers[i]);

            // Recur with a reduced target and the next index (i + 1) since each number can only be used once
            backtrack(numbers, target - numbers[i], i + 1, currentCombination, results);

            // Remove the last element to backtrack
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
