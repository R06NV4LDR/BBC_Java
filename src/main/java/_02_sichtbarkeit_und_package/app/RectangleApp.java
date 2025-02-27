package _02_sichtbarkeit_und_package.app;

import _02_sichtbarkeit_und_package._02_geometry.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        double width = 4;
        double length = 5;
        double area = Rectangle.calculateArea(width, length);
        System.out.println("Fläche: " + area + " cm");
        double perimeter = Rectangle.calculatePerimeter(width, length);
        System.out.println("Umfang: " + perimeter + " cm");
    }
}
