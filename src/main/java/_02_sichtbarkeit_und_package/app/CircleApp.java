package _02_sichtbarkeit_und_package.app;

import _02_sichtbarkeit_und_package._02_geometry.Circle;

public class CircleApp {
    public static void main(String[] args) {
        int radius = 10;
        double area = Circle.calculateArea(radius);
        System.out.println("Kreisfläche bei Radius " + radius + "cm: "  + area + "cm");
        double circumference = Circle.calculateCircumference(radius);
        System.out.println("Kreisumfang Radius " + radius + "cm: " + circumference + "cm");

    }
}
