package ihor.week_5;

import javax.xml.stream.events.Characters;

public class FrequencyOfCharacters {
    public static String getFrequencyOfChars(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        while (str.length() > 0) {
            char currentChar = str.charAt(0);
            int count = 0;

            // Count the occurrences of the current character
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == currentChar) {
                    count++;
                }
            }
            // Append the character and its count to the result
            result.append(currentChar).append(count);
            // Remove all occurrences of the current character from the string
            str = str.replace(String.valueOf(currentChar), "");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println("Frequency of characters: " + getFrequencyOfChars(input));
    }
}

/*
Input Validation -  The method checks if the input string is null or empty.
While Loop - It processes the string while there are characters left.
Character Counting -  The number of occurrences of the current character is counted.
StringBuilder - Appends each character and its frequency to the result.
Remove Processed Characters -  Removes the processed character from the string to avoid recounting.
Output - Returns the frequency of each character in the format specified.
*/