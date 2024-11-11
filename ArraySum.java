public class ArraySum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 8, 10};
        int sum = calculateSum(array, array.length);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] array, int n) {
        if (n <= 0) {
            return 0; // Base case: when n is 0 or negative, return 0
        }
        return calculateSum(array, n - 1) + array[n - 1]; // Recursive case: sum of elements
    }
}
