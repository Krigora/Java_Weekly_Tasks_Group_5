package noza.week_8;

public class ReverseString {


    /*
       `Write a return method that can reverse  String
        Ex: Reverse("ABCD"); ==> DCBA
    */




    public static void main(String[] args) {

        System.out.println(reverseString("ABCD")); //Output: DCBA

    }



    //this method returns the reversed version of the given string
    public static String reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {  // <= iterating backwards
            reversed += str.charAt(i);
        }

        return reversed;

    }





















}
