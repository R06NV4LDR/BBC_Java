package _03_von_klassen_zu_objekten._01_geometry;

public class LineApp {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        Point p2 = new Point();
        p2.setX(4);
        p2.setY(4);
        double distance = Line.calculateDistance(p1, p2);
        System.out.println("Distanz zwischen P1 und P2 ist: " + distance);

    }
}