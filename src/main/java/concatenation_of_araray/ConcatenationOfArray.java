package concatenation_of_araray;

public class ConcatenationOfArray {

    public int[] concatenate(int[] nums) {
        int[] newNums = new int[nums.length * 2];

        for (int i = 0; i < newNums.length; i++) {
            if (i < nums.length) {
                newNums[i] = nums[i];
            } else {
                newNums[i] = nums[i - nums.length];
            }
        }

        return newNums;
    }

}
