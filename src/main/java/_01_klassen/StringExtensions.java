package _01_klassen;

public class StringExtensions {

    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));

        String zahl = "12345";
        System.out.println(quersum(zahl)); // Quersumme
    }

    static String reverse(String text) {
        String reversedString = "";
        for (int i = 0; i < text.length(); i++) {
            reversedString = text.charAt(i) + reversedString;
        }
        return reversedString;
    }

    static int quersum(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += Character.getNumericValue(value.charAt(i));
        }
        return sum;
    }
}
