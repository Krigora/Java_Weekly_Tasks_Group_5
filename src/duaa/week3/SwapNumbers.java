package duaa.week3;

public class SwapNumbers {

        public static void main(String[] args) {
            int num1 = 6;
            int num2 = 12;

            System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

            // Swap numbers without using a third variable
            num1 = num1 + num2; // num1 becomes 18
            num2 = num1 - num2; // num2 becomes 6 (original value of num1)
            num1 = num1 - num2; // num1 becomes 12 (original value of num2)

            System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        }



}
