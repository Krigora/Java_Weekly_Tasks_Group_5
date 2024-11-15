package eugene.week_1;

import java.util.Scanner;

public class OddOrEven {


    //Created a method:
        public static boolean isEven(int number) {
            return number % 2 == 0;
        }


    //The code to check is Odd or Even:
        public static void main(String[] args) {

    //Getting a number using a Scanner:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

    //Checked if given number is Odd or Even calling an "isEven()" method:
        if (isEven(number)) {
            System.out.println("identify(" + number + ") ->" + " \"Even\"");
        } else {
            System.out.println("identify(" + number + ") ->" + " \"Odd\"");

        }


    }
}


/*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */

