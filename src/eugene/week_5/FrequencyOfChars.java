package eugene.week_5;


public class FrequencyOfChars {

    /*
    Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    package week11.morning;

    */

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = getCharacterFrequency(str);
        System.out.println(result); // Output: A3B2C1D2
    }


    public static String getCharacterFrequency(String str) {
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // Get the current character
            int count = 0;

            // Count occurrences of the current character in the string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            // Skip adding the character if it's already in the result
            if (result.contains("" + ch)) {
                continue;
            }

            // Append the character and its frequency to the result
            result += ch + "" + count;
        }

        return result;
    }
}
