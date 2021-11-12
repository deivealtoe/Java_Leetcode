package two_sum;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] indicesFound = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indicesFound[0] = i;
                    indicesFound[1] = j;
                }
            }
        }

        return indicesFound;
    }

}
