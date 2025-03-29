package Level2;

import java.util.Scanner;

public class pb8 {

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static void displayMenu() {
        System.out.println("Select conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter choice (1/2): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayMenu();
        int choice = sc.nextInt();

        double temperature;
        double result = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                result = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit = " + result + " Celsius");
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                result = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius = " + result + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
                return;
        }
    }
}

