package eugene.week_6;
/*
`Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Characters: ");


        // Input Example:
        String input = scanner.nextLine().toUpperCase();
        scanner.close();

        String output = removeDup(input);

        // Print Results:
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }



    public static String removeDup(String str) {

        String result = "";                         //Initialize an empty string to store unique characters

        for (int i = 0; i < str.length(); i++) {    //i: index numbers of str
            char each = str.charAt(i);              //each character of the String str

            if (!result.contains("" + each)) {      //Only add the character if it is not already in the result
                result += each;                     //Append the character to the result
            }
        }

        return result;


    }
}
