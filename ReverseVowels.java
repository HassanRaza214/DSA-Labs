public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello world";

        System.out.println("Original: " + s);
        System.out.println("Reversed Vowels: " + reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (vowels.indexOf(arr[left]) < 0) {
                left++;
            } else if (vowels.indexOf(arr[right]) < 0) {
                right--;
            } else {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }

        return new String(arr);
    }
}
