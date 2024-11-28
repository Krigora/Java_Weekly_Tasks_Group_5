package noza.week_2;

public class FINRA {


    /*
            FINRA :
        Write a method which prints out the numbers from 1 to 30 but for numbers which
        are a multiple of 3 print "FIN" instead of the number and for numbers which are a
        multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
        both 3 and 5, print "FINRA" instead of the number.
         // 1  2  FIN  4  RA FIN 7 8  FIN  RA 11  FIN 13 14 FINRA ...
    */



    public static void main(String[] args) {

        //calling printNumbers() method
        printNumbers(); // Output:
        // 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA

    }



    //this method prints out the numbers from 1 to 30 following the FINRA rules
    public static void printNumbers(){

        //loop from 1 to 30 (inclusive)
        for (int i = 1; i <= 30; i++) {

            //declaring boolean local variables to store nums divisible by 3:
            boolean by3 = i % 3 == 0;

            //nums divisible by 5:
            boolean by5 = i % 5 == 0;


            // First check if the number is divisible by both 3 and 5
            if (by3 && by5) {
                System.out.print("FINRA ");
            } else if (by3) {
                System.out.print("FIN ");
            } else if (by5) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }


        }



    }










}
