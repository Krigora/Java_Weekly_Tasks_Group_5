package noza.week_7;

public class FindUniqueCharacter {


    /*
        `String -- Find the unique
        Write a return method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    */



    public static void main(String[] args) {

        System.out.println(findUniqueChar("AAABBBCCCDEF")); //Output: DEF

    }



    //this method finds & returns the unique characters in the String
    public static String findUniqueChar(String str) {

        String unique = ""; // <- to store unique characters

        int[] charCount = new int[256]; //assuming ascii characters
        //charCount to store the frequency of each character by using the ascii value as an index.

        //count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        //add characters that appear only once to the unique string
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                unique += str.charAt(i);
            }
        }

        return unique;

    }






























}
