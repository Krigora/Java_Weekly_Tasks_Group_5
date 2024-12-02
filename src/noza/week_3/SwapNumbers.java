package noza.week_3;

public class SwapNumbers {


    /*
         Swap 2 numbers without using a 3rd variable
     */




    public static void main(String[] args) {


        // Swapping numbers using arithmetic operations:

        int a = 40;
        int b = 60;

        //adding b to a -> so a becomes equal to sum of both #s
        a = a + b;  // 40 + 60 = 100  => a = 100

        //subtracting b from a -> so b becomes equal to a's initial number
        b = a - b;  // 100 - 60 = 40  => b = 40

        //subtracting b from a again -> so a becomes equal to b's initial number
        a = a - b;  // 100 - 40 = 60  => a = 60

        System.out.println("a = " + a);
        System.out.println("b = " + b);






    }











}
