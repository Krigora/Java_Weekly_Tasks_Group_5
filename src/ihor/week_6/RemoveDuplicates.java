package ihor.week_6;

public class RemoveDuplicates {
    /*
`Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
    public static String removeDup(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) { // Check if character is not already in the result
                result.append(c); // Append unique character to result
            }
        }
        return result.toString(); // Return the result as a string
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String output = removeDup(input);
        System.out.println("Output: " + output); // Prints: Output: ABC
    }
}


