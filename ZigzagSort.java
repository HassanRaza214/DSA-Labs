import java.util.Arrays;

public class ZigzagSort {

    public static void zigzagSort(int[] arr) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i += 2) {
            if (i < arr.length - 1) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 6, 3, 1, 4};
        zigzagSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}