package ihor.week_11;

import java.util.Arrays;

public class AscendingSort {
    public static int[] sort(int[] arr) {
        int n = arr.length;

        // Simple Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 8, -7}; // Example input
        arr = sort(arr);
        System.out.println(Arrays.toString(arr)); // Print sorted array
    }
}

