package youness.week_3;

public class SwapTwoNumbers {
     /*
    Swap 2 numbers without using a 3rd variable
     */
     public static void main(String[] args) {
         int x= 20;
         int y= 10;
         System.out.println("Before Swaping , x = " + x+ " and y = " + y);

         x= x+y;
         y= x-y;
         x= x-y;

         System.out.println("Afetr Swaping , x = " + x+ " and y = " + y);
     }

}
