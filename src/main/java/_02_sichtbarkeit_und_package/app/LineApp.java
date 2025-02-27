package _02_sichtbarkeit_und_package.app;

import _02_sichtbarkeit_und_package._02_geometry.Line;

public class LineApp {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 4;

        double distance = Line.calculateDistance(x1, x2, y1, y2);
        System.out.println("Distance: " + distance);
    }
}
