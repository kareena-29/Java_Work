package Questions.Plan1;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {10,20,30};
        int[] sol = runningSum(nums);
        System.out.println(Arrays.toString(sol));

    }
    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] sol = new int[nums.length];
        sol[0] = sum;
        for(int i = 1; i<nums.length; i++){
            sum += nums[i];
            sol[i] = sum;
        }
        return sol;
    }
}
