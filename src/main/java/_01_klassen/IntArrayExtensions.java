package _01_klassen;

import java.util.Arrays;
import java.util.Random;

public class IntArrayExtensions {

    public static void main(String[] args) {
        int[] tenRandomNumber = getRandomNumbersInRange(10, 0, 9);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }

    /**
     * Creates an array with random number.
     *
     * @param size The size of the array.
     * @param min  The smallest possible generated number.
     * @param max  The biggest possible generated number.
     * @return the generated int array.
     */
    static int[] getRandomNumbersInRange(int size, int min, int max) {
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }

    static int getMax(int[] elements) {
        int maxNum = elements[0];
        for (int i : elements) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    static int getMin(int[] elements) {
        int minNum = elements[0];
        for (int i : elements) {
            if (i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }

    static double getAverage(int[] elements) {
        int sum = 0;
        for (int i : elements) {
            sum += i;
        }
        return (double) sum / elements.length;
    }

    static int[] sort(int[] elements) {
        int[] sortedArray = Arrays.copyOf(elements, elements.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    static int[] reverse(int[] elements) {
        int[] reversedArray = Arrays.copyOf(elements, elements.length);
        for (int i = 0; i < elements.length / 2; i++) {
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[elements.length - 1 - i];
            reversedArray[elements.length - 1 - i] = temp;
        }
        return reversedArray;
    }

    static int[] mix(int[] elements) {
        Random random = new Random();
        for (int i = elements.length - 1; i >0; i--) {
            int index = random.nextInt(i + 1);

            int temp = elements[i];
            elements[i] = elements[index];
            elements[index] = temp;
        }
        return elements;
    }
}
