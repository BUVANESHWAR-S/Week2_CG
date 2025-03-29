package Level2;

import java.util.Scanner;

public class pb6 {

    static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    static void displayResult(int result) {
        System.out.println("The factorial is: " + result);
    }

    public static void main(String[] args) {
        int number = takeInput();
        int factorial = calculateFactorial(number);
        displayResult(factorial);
    }
}

