package _02_sichtbarkeit_und_package.app;

import _02_sichtbarkeit_und_package._01_common.IntArrayExtensions;

import java.util.Arrays;


public class IntArrayExtensionApp {
    public static void main(String[] args) {
       int[] randomNumbers = IntArrayExtensions.getRandomNumbersInRange(10, 0 , 9);

        System.out.println("Zufällige Zahlen: " + Arrays.toString(randomNumbers));
        System.out.println("Kleinster Wert: " + IntArrayExtensions.getMin(randomNumbers));
        System.out.println("Grösster Wert: " + IntArrayExtensions.getMax(randomNumbers));
        System.out.println("Durchschnitt: " + IntArrayExtensions.getAverage(randomNumbers));
        System.out.println("rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(randomNumbers)));
        System.out.println("sortiert: " + Arrays.toString(IntArrayExtensions.sort(randomNumbers)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(IntArrayExtensions.sort(randomNumbers))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(IntArrayExtensions.mix(IntArrayExtensions.sort(randomNumbers))));
    }
}
