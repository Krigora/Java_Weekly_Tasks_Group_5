package eugene.week_2;

/*
    FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.

// 1  2  FIN  4  RA FIN 7 8  FIN  RA 11  FIN 13 14 FINRA ...
 */

public class FINRA {

    // -> Creating a printFINRA method
        public static void printFINRA() {

    // -> Setting up a loop to iterate numbers from 0 to 30
            for (int i = 1; i <= 30; i++) {

    // -> Declaring 2 boolean variables which will be checking divisibility by 3 and 5 and storing them
                boolean divBy3 = i % 3 == 0;
                boolean divBy5 = i % 5 == 0;

                String result = ""; // -> temporary result String, which will be storing an output in future

    // -> Checking a condition:
                if (divBy3 && divBy5) {
                    result = "FINRA";
                } else if (divBy3) {
                    result = "FIN";
                } else if (divBy5) {
                    result = "RA";
                } else {
                    result = "" + i;

                }
                System.out.print(result + " ");

            }
        }

    public static void main(String[] args) {
        printFINRA(); // -> calling a method
    }
    }

