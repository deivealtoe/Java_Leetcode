package search_insertion_position;

public class SearchInsertionPosition {

    public int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i] || target < numbers[i]) {
                return i;
            } else if (i == numbers.length - 1) {
                return i + 1;
            }
        }

        return numbers.length - 1;
    }

}
