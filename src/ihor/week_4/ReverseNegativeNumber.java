package ihor.week_4;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int number) {
        // Check if the number is negative
        if (number >= 0) {
            throw new IllegalArgumentException("The number must be negative.");
        }

        // Convert the number to positive for reversal
         int positiveNumber = -number;
        int reversedNumber = 0;





        // Reverse the digits
        while (positiveNumber != 0) {
            int digit = positiveNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            positiveNumber /= 10;
        }

        // Return the reversed number as a negative
        return -reversedNumber;
    }

    public static void main(String[] args) {

        int number = -12345;
        int reversed = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversed);


        number = -987;
        reversed = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversed);
    }
}
