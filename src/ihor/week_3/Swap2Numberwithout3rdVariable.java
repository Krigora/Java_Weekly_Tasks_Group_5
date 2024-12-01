package ihor.week_3;

public class Swap2Numberwithout3rdVariable {
    public static void main(String[] args) {
        int a = 10, b = 20;
         int c = 10, d = 20;

// Swapping logic
        a = a + b; // a becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

         c = c ^ d; // Step 1
         d = c ^ d; // Step 2
         c = c ^ d; // Step 3

        System.out.println("After swapping: a = " + a + ", b = " + b);
        System.out.println("After swapping: a = " + c + ", b = " + d);
    }

}
