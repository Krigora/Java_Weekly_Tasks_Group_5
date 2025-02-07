package eugene.week_11;

import java.util.Scanner;

public class MoveZerosToEnd {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[10];

            // Step 1: Take input from the user
            System.out.println("Enter 10 digits (including zeros):");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            // Step 2: Move zeros to the end
            moveZerosToEnd(array);

            // Step 3: Print the modified array
            System.out.print("Output: [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            scanner.close();
        }

        public static void moveZerosToEnd(int[] array) {
            int nonZeroIndex = 0; // Pointer to place the next non-zero element

            // Traverse the array and move non-zero elements to the front
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    array[nonZeroIndex] = array[i];
                    nonZeroIndex++;
                }
            }

            // Fill the remaining positions with zeros
            while (nonZeroIndex < array.length) {
                array[nonZeroIndex] = 0;
                nonZeroIndex++;
            }
        }
    }



/*
` Array -- Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */