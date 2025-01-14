package eugene.week_8;

import java.util.Scanner;

public class StringReverse {
    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}




/*
`Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */