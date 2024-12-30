package ihor.week_5;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {
    /*
    Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    package week11.morning;

    */

    public static void FrequencyTest(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        FrequencyTest("AAABBCDD");
    }



}


