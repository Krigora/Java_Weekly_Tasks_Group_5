package alina.week_5;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"ABCABC\") = " + removeDuplicates("ABCABC"));
    }

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (result.contains(ch)) {
                continue;
            }
            result += ch;
        }
        return result;
    }
}
/*
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC
    */
