package youness.week_10;

public class MaximumNumInArray {

    public static void main(String[] args) {

        //int [] nums= {41,26,36,4,99,0};
        //int max= nums[0];
        //for (int i = 0; i < nums.length ; i++) {
            //if (nums[i]> nums[0]){
                //max= nums[i];
//
            //}
        int [] nums= {41,26,36,4,99,0};
        maxNumInArr(nums);

        }

    public static int maxNumInArr(int [] nums){

        int max= nums[0];

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]> nums[0]){
                max= nums[i];
            }
        }
        System.out.println("max = " + max);
        return max;
    }

}
