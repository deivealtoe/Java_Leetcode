package running_sum_of_1d_array;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        int[] newNums = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            newNums[i] = sum;
        }

        return newNums;
    }

}
