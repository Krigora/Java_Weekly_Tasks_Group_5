package alina.week_3;

public class SwapTwoNumbers {
    public static void swapNumbers(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        //Add both numbers
        a = a + b;

        // Subtract b from the sum
        b = a - b;

        //Subtract new b from the sum (original b)
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumbers(a, b);

        swapNumbers(5,7);
    }
}


/*
    Swap 2 numbers without using a 3rd variable
 */