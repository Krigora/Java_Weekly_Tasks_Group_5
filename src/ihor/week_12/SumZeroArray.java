package ihor.week_12;

import java.util.Arrays;

public class SumZeroArray {
    public static int[] sumZero(int N) {
        int[] result = new int[N];
        int index = 0;

        // Add pairs (-x, x)
        for (int i = 1; i <= N / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If N is odd, include 0
        if (N % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5; // Example input
        int[] arr = sumZero(N);
        System.out.println(Arrays.toString(arr)); // Print the array
    }
}
