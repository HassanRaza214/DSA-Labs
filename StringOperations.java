public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "this ";
        String str3 = "is ";
        String str4 = "a ";
        String str5 = "test.";

        String concatenatedString = str1 + str2 + str3 + str4 + str5;
        String upperCaseStr4 = str4.toUpperCase();

        String substring = concatenatedString.substring(8);
        System.out.println("Concatenated String: " + concatenatedString);
        System.out.println("Uppercase Fourth String: " + upperCaseStr4);
        System.out.println("Substring from index 8: " + substring);
    }
}
