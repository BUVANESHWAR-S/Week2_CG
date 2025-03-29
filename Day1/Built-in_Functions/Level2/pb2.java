package Level2;

import java.util.Scanner;

public class pb2 {

    static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        return max;
    }

    static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        int num1 = takeInput("Enter the first number: ");
        int num2 = takeInput("Enter the second number: ");
        int num3 = takeInput("Enter the third number: ");

        int max = findMax(num1, num2, num3);
        displayResult(max);
    }
}
