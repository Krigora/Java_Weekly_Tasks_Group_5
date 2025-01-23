package youness.week8;

public class PasswordValidation {

    public static boolean passwordIsValid(String password){

        // check if password has at least have 6 characters and should not contain space

        if (password.length() < 6 || password.contains(" ")){
            return false;
        }

        // initiate flags to track the solution
        boolean hasUpperCase= false;
        boolean hasLowerCase= false;
        boolean hasSpecialChar= false;
        boolean hasDigit= false;


        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                hasUpperCase= true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase= true;
            }
            if (Character.isDigit(c)) {
                hasDigit=  true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar= true;
            }

        }
        return hasUpperCase && hasDigit && hasLowerCase && hasSpecialChar;
    }


    public static void main(String[] args) {
        System.out.println(passwordIsValid("Cydeo@B37"));

    }
}
