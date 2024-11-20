package rina.week_1;

public class OddOrEven {
/*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */

//working on the code

    public static void OddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }



    public static void main(String[] args) {
        OddOrEven(5);
        OddOrEven(6);

    }
}
