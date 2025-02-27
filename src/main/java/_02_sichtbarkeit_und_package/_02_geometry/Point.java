package _02_sichtbarkeit_und_package._02_geometry;

public class Point {
    private static int x;
    private static int y;

    public static void setX(int newX) {
        x = newX;
    }

    public static void setY(int newY) {
        y = newY;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }
}

