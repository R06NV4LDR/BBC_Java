package _03_von_klassen_zu_objekten._01_geometry;

public class Line {
    public static double calculateDistance(int x1, int x2, int y1, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        return distance;
    }
// Auftrag 2 - Klassen als Methodenparameter
    public static double calculateDistance(Point p1, Point p2) {
    return calculateDistance(p1.getX(), p2.getX(), p1.getY(), p2.getY());
    }
}
