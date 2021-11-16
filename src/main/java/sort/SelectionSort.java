package sort;

public class SelectionSort implements SortingAlgorithm {

    public int[] getSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int positionOfLowestValue = i;

            positionOfLowestValue = this.getPositionOfLowestValue(nums, i);

            int temp = nums[positionOfLowestValue];
            nums[positionOfLowestValue] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public int getPositionOfLowestValue(int[] nums, int positionOfLowestValue) {
        for (int j = positionOfLowestValue; j < nums.length; j++) {
            if (nums[j] < nums[positionOfLowestValue]) {
                positionOfLowestValue = j;
            }
        }

        return positionOfLowestValue;
    }

}
