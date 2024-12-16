package eugene.week_4;

import java.util.Scanner;

public class ReverseNegativeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a NEGATIVE number to reverse: ");

        int num = scanner.nextInt();
        int reversedNum = reverseInt(num);
        scanner.close();

        System.out.println("Original Negative Number: " + num);
        System.out.println("Reversed Negative Number: " + reversedNum);
    }


    //Creating a method:
    public static int reverseInt(int num) {
        //We need not only read numbers staring from the last digit, we should build them back on reverse order
        //Ex:  input: 1234; output: 4321

        int reversed = 0; // --> Starting point

        while (num != 0) { //(num > 0 => we can use for reversing positive number)
            int lastDigit = num % 10; // Read the last digit
            reversed = reversed * 10 + lastDigit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original numbers set
        }
        return reversed;
    }

}
/*
`2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */

