package noza.week_4;

public class ReverseNegativeNumbers {


    /*
       2. Numbers -- Reverse negative number
       Write a return method that can reverse negative number & return it as int
       Ex: input: -1234    output: -4321
    */



    public static void main(String[] args) {

        System.out.println(reverseInt(-1234)); // Output: -4321

    }



    public static int reverseInt (int num) {

        int reversed = 0; // <- to store the reversed version of nums

        // (num > 0) -> can be used to reverse positive nums
        while (num != 0) {
        //condition is true while num is negative, so reversing negative nums
            int lastDigit = num % 10; // -> reading the last digit

            //after reading the last digit, increase it by 10th place each iteration,
            //then add it to the reversed number:
            reversed = reversed * 10 + lastDigit;
            num /= 10; // <- this removes the last digit from "num"
        }

        return reversed;

    }









}
