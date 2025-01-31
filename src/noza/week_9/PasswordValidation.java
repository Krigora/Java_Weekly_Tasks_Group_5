package noza.week_9;

public class PasswordValidation {


    /*
        Password Validation Task
        1. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns  false
    */


    public static void main(String[] args) {

        System.out.println(verifyPassword("Password1!"));  // true
        System.out.println(verifyPassword("pass1!"));      // false (no uppercase letter)
        System.out.println(verifyPassword("Password"));    // false (no digit or special char)
        System.out.println(verifyPassword("Pass 1!"));     // false (contains space)
        System.out.println(verifyPassword("P@ssw0rd"));    // true

    }


    public static boolean verifyPassword(String password) {

        // First check if password length is at least 6 characters & doesn't contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // boolean variables for different requirements
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Loop through the password to check each condition
        for (char ch : password.toCharArray()) { // <- here converting string password into an array of chars
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        // if all requirements are met, return true
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

    }






















}
