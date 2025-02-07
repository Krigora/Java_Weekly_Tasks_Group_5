package youness.week_4;

public class ReverseNegativeNumbers {

    //2. Numbers -- Reverse negative number
    //Write a return method that can reverse negative number and return it as int
    // */
        public static int reverseNegative(int number) {
            if (number >= 0) {
                throw new IllegalArgumentException("Input must be a negative number.");
            }

            // Convert to positive
            int positiveNumber = -number;
            int reversedNumber = 0;

            while (positiveNumber != 0) {
                int digit = positiveNumber % 10;
                reversedNumber = reversedNumber * 10 + digit;
                positiveNumber /= 10;
            }

            // Return the reversed number as negative
            return -reversedNumber;
        }


        public static void main(String[] args) {
            int negativeNumber = -98765;               // output should be -56789
            int reversed = reverseNegative(negativeNumber);
            System.out.println("Reversed negative number: " + reversed);
        }

    }



