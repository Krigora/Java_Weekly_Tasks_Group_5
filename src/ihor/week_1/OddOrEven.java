package ihor.week_1;



public class OddOrEven {

    public static String identify(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println("identify(5) -> " + identify(5)); // Output: Odd
        System.out.println("identify(6) -> " + identify(6)); // Output: Even
    }

}


/*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */