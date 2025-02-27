package _01_klassen;

public class Rectangle {
    public static void main(String[] args) {
        double width = 4;
        double length = 5;
        double area = calculateArea(width, length);
        System.out.println("Fläche: " + area + " cm");
        double perimeter = calculatePerimeter(width, length);
        System.out.println("Umfang: " + perimeter + " cm");
    }

    static double calculateArea(double width, double length) {
        return width * length;
    }

    static double calculatePerimeter(double width, double length) {
        return 2 * width + 2 * length;
    }
}
