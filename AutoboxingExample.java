public class AutoboxingExample {
    public static void main(String[] args) {
        Integer intObj = 10; // int to Integer
        Double doubleObj = 20.5; // double to Double

        int intValue = intObj; // Integer to int
        double doubleValue = doubleObj; // Double to double

        System.out.println("Integer value: " + intObj);
        System.out.println("Double value: " + doubleObj);
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("Parsed Integer: " + Integer.parseInt("100"));
        System.out.println("Parsed Double: " + Double.parseDouble("50.75"));
    }
}
