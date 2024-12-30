package noza.week_6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {


    /*
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC
    */



    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC")); //Output: ABC

        System.out.println(removeDuplicates2("AAABBBCCC")); //Output: ABC


    }




    //this method removes duplicates using simple string operations & loop
    public static String removeDuplicates(String str) {

        String result = ""; // <- to store unique characters

        //loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            //if result doesn't contain the character -> add to the result
            if(!result.contains(eachChar + "")) {
                result += eachChar;
            }
            //this way will only add the unique chars that don't exist in result
        }

        return result;

    }


    //this method removes duplicates using HashSet and StringBuilder
    public static String removeDuplicates2(String str) {

        //below HashSet stores unique characters
        HashSet<Character> uniqueChars = new LinkedHashSet<>();

        //StringBuilder to build the resulting string
        StringBuilder result = new StringBuilder();

        //loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            //if HashSet uniqueChars doesn't contain the character,
            //then add it to the result
            if (!uniqueChars.contains(eachChar)) {
                result.append(eachChar);
                uniqueChars.add(eachChar);
            }

        }

        return result.toString(); // <- returning a String representation of StringBuilder

    }













}
