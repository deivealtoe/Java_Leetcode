package sort;

public class InsertionSort implements SortingAlgorithm {

    public int[] getSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int candidatePosition = i;

            while (candidatePosition > 0 && nums[candidatePosition] < nums[candidatePosition - 1]) {
                int temp = nums[candidatePosition];
                nums[candidatePosition] = nums[candidatePosition - 1];
                nums[candidatePosition - 1] = temp;

                candidatePosition--;
            }
        }

        return nums;
    }

}
