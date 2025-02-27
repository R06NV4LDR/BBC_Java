package _01_klassen;

import org.w3c.dom.ls.LSOutput;

public class TextUnderlinePrinter {
    public static void main(String[] args) {

        String outputText = "Man wird nicht dadurch besser, dass man andere schlecht macht.";
        String underlinedWord = "besser";
        System.out.println(outputText);
        underline(outputText, underlinedWord);
    }

    static void underline(String text, String word) {
        int startIndex = text.indexOf(word);
        if (startIndex == -1) {
            System.out.println("Das Wort " + word + " wurde nicht gefunden.");
            return;
        }

        for (int i = 0; i < startIndex; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < word.length(); i++) {
            System.out.print("^");
        }
        System.out.println();
    }
}
