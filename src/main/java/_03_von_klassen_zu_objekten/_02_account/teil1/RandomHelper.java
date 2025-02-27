package _03_von_klassen_zu_objekten._02_account.teil1;

import java.util.Random;

public class RandomHelper {
    public static double getRandomDouble(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();

    }
}
