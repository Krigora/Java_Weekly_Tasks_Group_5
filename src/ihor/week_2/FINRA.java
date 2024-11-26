package ihor.week_2;

import java.util.Scanner;

public class FINRA {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the start of the range: ");
            int start = scanner.nextInt();

            System.out.print("Enter the end of the range: ");
            int end = scanner.nextInt();


            if (start > end) {
                System.out.println("Invalid range! Start should be less than or equal to end.");
                return;
            }

            for (int i = start; i <= end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FINRA");
                } else if (i % 3 == 0) {
                    System.out.println("FIN");
                } else if (i % 5 == 0) {
                    System.out.println("RA");
                } else {
                    System.out.println(i);
                }
            }

            scanner.close();
        }
    }

