package youness.week_5;

public class FrequencyOfChars {
    //*-
    //Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    // */
    public static void main(String[] args) {

        System.out.println(frequencyOfChar("AAABBCDD"));

    }

    public static String frequencyOfChar(String str) {

        String result = "";
        int j = 0;
        while (j < str.length()) {

            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;

                }
            }
            result += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return result;

    }


}