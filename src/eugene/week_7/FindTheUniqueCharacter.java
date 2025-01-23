package eugene.week_7;

public class FindTheUniqueCharacter {

        public static String findUnique(String str) {

            String unique = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // Check if the character appears only once in the string
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    unique += ch; // Append the unique character
                }
            }

            return unique;
        }

        public static void main(String[] args) {
            String input = "AAABBBCCCDEF";
            String result = findUnique(input);
            System.out.println("Unique characters: " + result);
        }
    }





/*
`String -- Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */