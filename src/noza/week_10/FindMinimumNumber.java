package noza.week_10;

public class FindMinimumNumber {

    /*
        Find Minimum
        Write a method that can find the maximum number from an int Array.
    */


    public static void main(String[] args) {
        int[] nums = {15, 8, 2, 28, 4, 33};
        findMinNum(nums); //2
        findMin(nums); //2
        System.out.println(findMax(nums)); //33

        int[] nums2 = {-12, -5, -99, -22};
        findMinNum(nums2); //-99
        findMin(nums2); //-99
        System.out.println(findMax(nums2)); //-5

        int[] nums3 = {1};
        findMinNum(nums3); //1
        findMin(nums3); //1
        System.out.println(findMax(nums3)); //1

        int[] nums4 = {};
        findMinNum(nums4); //throws IllegalArgumentException: Array cannot be null or empty
        findMin(nums4);
        System.out.println(findMax(nums4));
    }


    //this method finds minimum number using Wrapper Constant Integer.MAX_VALUE; & Math.min();
    public static void findMinNum(int[] nums) {
        // Check if the array is empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = Integer.MAX_VALUE;
        for (int each : nums) {
            min = Math.min(min, each);
        }
        System.out.println(min);
    }


    //this method finds minimum number using simple relational operators
    public static void findMin(int[] nums) {
        // Check if the array is empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        // Initialize the min number to the first element in the array
        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }


    //this method finds & returns maximum number using simple relational operators
    public static int findMax(int[] nums) {
        // Check if the array is empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        // Initialize the max number to the first element in the array
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }






















    }
