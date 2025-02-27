package _01_klassen;

public class Point {
    private static int x;
    private static int y;

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();
        System.out.println(x + "," + y);
    }

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

