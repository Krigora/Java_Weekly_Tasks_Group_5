package youness.week_1;

/*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */

// update one more youness branch
public class OddOrEven {

    public static void main(String[] args) {
        identify (5);

    }

     static void identify (int num ){

        if (num % 2==0){

            System.out.println(num + " is Even number ");

        } else {
            System.out.println(num + " is Odd number");
        }
    }



}
