public class JavaApplication2 {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Data";
        String str3 = "C";
        String str4 = "Html";
        String str5 = "Css";

        String str6 = new String("Java");
        String str7 = new String("C");
        String str8 = new String("Html");
        String str9 = new String("Java");
        String str10 = new String("C").intern();

        System.out.println((str1 == str6) + " Strings are not equal");
        System.out.println((str3 == str10) + " Strings are equal");
    }
}
