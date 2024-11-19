package noza.week_1;

public class OddOrEven {

    /*
       Write a method which can identifies given number is even or odd
       EX:
       identify(5) ->  "Odd"
       identify(6) ->  "Even"
     */


    public static void main(String[] args) {

        //calling the identify() method:
        System.out.println(identify(6)); //Output: Even


    }


    //this method returns a string and identifies if the given number is even or odd
    public static String identify(int num){
        return (num % 2 == 0) ? "Even" : "Odd";
    }






}
