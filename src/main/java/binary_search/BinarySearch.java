package binary_search;

public class BinarySearch {


    public int searchIndexOfTargetInArray(int[] intValues, int target) {
        int left = 0;
        int right = intValues.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (target == intValues[middle]) {
                return middle;
            } else if (target < intValues[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
