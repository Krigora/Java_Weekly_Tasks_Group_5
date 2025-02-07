package youness.week_11;

import java.util.Arrays;

public class MoveTheZeros {
    /*
     Array -- Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {


        int nums[] = {1, 0, 2, 0, 3, 0, 4, 0};

        int[] moved = new int[nums.length];

        for (int i = 0, y = 0; i < nums.length; i++) {

            if (nums[i] !=0){
                moved[y]= nums[i];
                y++;
            }

        }
        System.out.println(Arrays.toString(moved));
    }
}
