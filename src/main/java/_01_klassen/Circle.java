package _01_klassen;

public class Circle {
    public static void main(String[] args) {
        int radius = 5;
        double area = calculateArea(radius);
        System.out.println("Kreisfläche bei Radius 5 cm: " + area + "cm");
        double circumference = calculateCircumference(radius);
        System.out.println("Kreisumfang Radius 5cm: " + circumference + "cm");
    }
    static double calculateArea(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    static double calculateCircumference(int radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}

