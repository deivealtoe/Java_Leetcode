package sort;

public class SelectionSort {

    public int[] getSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int initialPosition = i;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[initialPosition]) {
                    initialPosition = j;
                }
            }

            int temp = nums[initialPosition];
            nums[initialPosition] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

}
