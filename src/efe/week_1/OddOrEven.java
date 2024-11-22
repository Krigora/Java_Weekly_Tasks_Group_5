package efe.week_1;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        input.close();

        System.out.println(isEvenOrOdd(num));


    }

        // Method  can identify given number is even or odd

    public static String isEvenOrOdd (int number){
        if(number % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }
    }

}
/*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */
