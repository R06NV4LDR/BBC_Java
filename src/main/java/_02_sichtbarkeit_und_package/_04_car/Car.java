package _02_sichtbarkeit_und_package._04_car;
import java.util.Scanner;

public class Car {
    private String driverName;
    private boolean isMoving;

    public Car() {
        this.driverName = "";
        this.isMoving = false;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void start() {
        if (!driverName.isEmpty()) {
            isMoving = true;
            System.out.println("The car is now moving.");
        } else {
            System.out.println("Cannot start the car without a driver.");
        }
    }

    public void stop() {
        isMoving = false;
        System.out.println("The car has stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Enter driver name:");
        car.setDriverName(scanner.nextLine());

        while (true) {
            System.out.println("Enter command (start/stop/exit):");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("start")) {
                car.start();
            } else if (command.equalsIgnoreCase("stop")) {
                car.stop();
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }
}
