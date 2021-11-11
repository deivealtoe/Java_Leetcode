package search_insertion_position;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertionPositionTest {

    @Test
    public void shoudlReturnTwo() {
        // Given
        int[] numbers = {1, 3, 5, 6};
        int target = 5;
        int indexPositionExpected = 2;

        // When
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int actualIndexFound = searchInsertionPosition.search(numbers, target);

        // Then
        Assertions.assertEquals(indexPositionExpected, actualIndexFound);
    }

    @Test
    public void shoudlReturnOne() {
        // Given
        int[] numbers = {1, 3, 5, 6};
        int target = 2;
        int indexPositionExpected = 1;

        // When
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int actualIndexFound = searchInsertionPosition.search(numbers, target);

        // Then
        Assertions.assertEquals(indexPositionExpected, actualIndexFound);
    }

    @Test
    public void shoudlReturnFour() {
        // Given
        int[] numbers = {1, 3, 5, 6};
        int target = 7;
        int indexPositionExpected = 4;

        // When
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int actualIndexFound = searchInsertionPosition.search(numbers, target);

        // Then
        Assertions.assertEquals(indexPositionExpected, actualIndexFound);
    }

    @Test
    public void shoudlReturnZero() {
        // Given
        int[] numbers = {1, 3, 5, 6};
        int target = 0;
        int indexPositionExpected = 0;

        // When
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int actualIndexFound = searchInsertionPosition.search(numbers, target);

        // Then
        Assertions.assertEquals(indexPositionExpected, actualIndexFound);
    }

    @Test
    public void shoudlReturnAnotherZero() {
        // Given
        int[] numbers = {1};
        int target = 0;
        int indexPositionExpected = 0;

        // When
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int actualIndexFound = searchInsertionPosition.search(numbers, target);

        // Then
        Assertions.assertEquals(indexPositionExpected, actualIndexFound);
    }

    @Test
    public void shoudlReturnTen() {
        // Given
        int[] numbers = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3};
        int target = 1;
        int indexPositionExpected = 10;

        // When
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int actualIndexFound = searchInsertionPosition.search(numbers, target);

        // Then
        Assertions.assertEquals(indexPositionExpected, actualIndexFound);
    }

}
