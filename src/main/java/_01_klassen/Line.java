package _01_klassen;

public class Line {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 4;

        double distance = Line.calculateDistance(x1, x2, y1, y2);
        System.out.println("Distance: " + distance);
    }

    static double calculateDistance(int x1, int x2, int y1, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        return distance;
    }
}
