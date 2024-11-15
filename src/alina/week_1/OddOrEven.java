package alina.week_1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(identify(6));
    }


    //we can create a method with a return type or void type, I did return method
    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */

}

