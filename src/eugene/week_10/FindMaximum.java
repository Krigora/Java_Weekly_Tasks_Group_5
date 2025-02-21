package eugene.week_10;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaximum {

    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);
        // Initialize an ArrayList to store user input integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter integers, with instructions to type 'done' when finished
        System.out.println("Enter integers (type 'done' to stop):");

        // Loop to continually read input from the user until "done" is typed
        while (true) {
            // Read the user's input as a string
            String input = scanner.nextLine();
            // If the user types 'done', break out of the loop
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Try to convert the input string to an integer
            try {
                int number = Integer.parseInt(input); // Parse the string to an integer
                numbers.add(number); // Add the integer to the list
            } catch (NumberFormatException e) {
                // If input is not a valid integer, print an error message
                System.out.println("Invalid input. Please enter a valid integer or 'done' to finish.");
            }
        }

        // Convert the ArrayList to an int array for further processing
        int[] numArray = numbers.stream().mapToInt(Integer::intValue).toArray();

        // Call the findMax method to find the maximum value in the array
        int max = findMax(numArray);

        // Output the maximum value to the user
        System.out.println("Maximum value: " + max);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to find the maximum value in an array of integers
    public static int findMax(int[] array) {
        // Assume the first element is the maximum to start
        int max = array[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If a larger value is found, update max
            if (array[i] > max) {
                max = array[i];
            }
        }
        // Return the maximum value found in the array
        return max;
    }
}

/*
`Find Minimum
Write a method that can find the maximum number from an int Array.
 */
