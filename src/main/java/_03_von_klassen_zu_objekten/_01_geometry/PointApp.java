package _03_von_klassen_zu_objekten._01_geometry;

public class PointApp {
    public static void main(String[] args) {
        // Auftrag 1 - Erstellen von Point Instanzen
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setX(1);
        p1.setY(2);
        p2.setX(3);
        p2.setY(4);
        // Auftrag 3 - Klasse als Rückgabewert
        Point p3 = Point.createPoint(5, 6);
        Point p4 = Point.createPoint(7, 8);

        String x1 = Integer.toString(p1.getX());
        String y1 = Integer.toString(p1.getY());
        String x2 = Integer.toString(p2.getX());
        String y2 = Integer.toString(p2.getY());
        System.out.println("Point 1: x=" + x1 + " y=" + y1);
        System.out.println("Point 2: y=" + x2 + " y=" + y2);



    }
}
