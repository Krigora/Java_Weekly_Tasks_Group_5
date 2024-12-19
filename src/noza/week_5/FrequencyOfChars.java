package noza.week_5;

import java.util.HashMap;

public class FrequencyOfChars {


    /*
        Frequency of Characters
        Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */



    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD")); //Output: A3B2C1D2

    }




    public static String frequencyOfChars(String str) {

        //below hashMap stores the count of each character:
        HashMap<Character, Integer> counter = new HashMap<>(); // it's 0 at first
        //Hashmap doesn't maintain the insertion order of characters.
        //Can use LinkedHashMap to keep the insertion order of characters.

        //Character - key;   Integer - count

        //loop through each character in the string:
        for (int i=0; i<str.length(); i++) {
            char eachChar = str.charAt(i);

            //1st check if the counter already has the char or it doesn't

            //if it doesn't, it's unique -> then create an entry for the 1st time:
            if (!counter.containsKey(eachChar)) {
                counter.put(eachChar, 0);
            }

            //if counter contains the char -> then update the count of each character in the map:
            counter.put(eachChar, counter.get(eachChar) + 1);

        }

        //build the result string
        StringBuilder result = new StringBuilder();

        //iterate through the keys of the HashMap,
        //then concatenate to StringBuilder result -> each character followed by its count using append method
        for (char each : counter.keySet()) {
            result.append(each).append(counter.get(each));
        }

        return result.toString(); // <- returning a String representation of the StringBuilder

    }








}
