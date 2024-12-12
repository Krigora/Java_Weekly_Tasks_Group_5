package eugene.week_3;

/*
  Swap 2 numbers without using a 3rd variable
*/

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        //Solving a task with arithmetic operations:

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("Please enter second number: ");
        int b = input.nextInt();

        System.out.println("Numbers before swapping: first number = " + a + ", second number = " + b);

        a = a + b;  //-> 10 + 20 = 30;
        b = a - b;  //-> 30 - 20 = 10;
        a = a - b;  //-> 30 - 10 = 20;


        System.out.println("Numbers after swapping: first number = " + a + ", second number = " + b);
    }
}
