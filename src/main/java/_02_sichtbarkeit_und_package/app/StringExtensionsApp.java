package _02_sichtbarkeit_und_package.app;


import _02_sichtbarkeit_und_package._01_common.StringExtensions;

public class StringExtensionsApp {
    public static void main(String[] args) {
        String text = "HeLlO WoRlD";
        String number ="12345678910";
        StringExtensions.reverse(text);
        StringExtensions.quersum(number);
        System.out.println("reversed: " + StringExtensions.reverse(text));
        System.out.println(StringExtensions.quersum(number));
    }
}
