package eugene.week_9;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Infinite loop to continuously prompt the user for a valid password
        while (true) {
            System.err.println("Please enter a password:");
            String password = scanner.nextLine();  // Read user input

            // Check if the password contains spaces
            if (password.contains(" ")) {
                System.out.println("Password is invalid: Should not contain spaces.");
                continue; // Restart the loop to prompt for a new password
            }

            // Validate the password using the getPasswordValidationMessage method
            String validationMessage = getPasswordValidationMessage(password);

            // If there are no validation messages, the password is valid
            if (validationMessage.isEmpty()) {
                System.out.println("Password is valid.");
                break;  // Exit the loop since the password is valid
            } else {
                // Display validation errors
                System.out.println("Password is invalid: " + validationMessage);
            }
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }


    public static String getPasswordValidationMessage(String password) {
        String message = "";  // Initialize an empty string to hold validation messages

        // Check if the password meets the minimum length requirement
        if (password.length() < 6) {
            message += "Must be at least 6 characters. ";
        }

        // Flags to track the presence of required character types
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Define a string containing allowed special characters
        String specialChars = "!@#$%^&*()-_=+[]{};:'\",.<>/?`~";

        // Iterate through each character in the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;  // Found at least one uppercase letter
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;  // Found at least one lowercase letter
            } else if (Character.isDigit(ch)) {
                hasDigit = true;  // Found at least one digit
            } else if (specialChars.contains(String.valueOf(ch))) {
                hasSpecialChar = true;  // Found at least one special character
            }
        }

        // Append messages for missing requirements
        if (!hasUpperCase) {
            message += "Include at least one uppercase letter. ";
        }
        if (!hasLowerCase) {
            message += "Include at least one lowercase letter. ";
        }
        if (!hasDigit) {
            message += "Include at least one digit. ";
        }
        if (!hasSpecialChar) {
            message += "Include at least one special character. ";
        }

        // Return the validation messages (trimmed of extra spaces)
        return message.trim();
    }
}
