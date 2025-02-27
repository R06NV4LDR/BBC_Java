package _02_sichtbarkeit_und_package._02_geometry;

public class Line {
    public static double calculateDistance(int x1, int x2, int y1, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        return distance;
    }
}
