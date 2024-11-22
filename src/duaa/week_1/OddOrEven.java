package duaa.week_1;

import java.util.Scanner;

public class OddOrEven {

    // Method to identify if a number is even or odd
    public String identifyEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        OddOrEven checker = new OddOrEven();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read user input

        String result = checker.identifyEvenOrOdd(number);
        System.out.println("identify(" + number + ") -> " +  result );

        scanner.close(); // Close the scanner to free resources
    }
}

/*
write a method which can identifies given number is even or odd
Ex:
identify(5) -> "Odd"
identify(6) -> "Even"
 */
