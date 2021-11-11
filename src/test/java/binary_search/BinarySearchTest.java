package binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void shouldFindIndexFour() {
        // Given
        int[] intValues = {-1, 0, 3, 5, 9, 12};

        // When
        int target = 9;
        int indexOfTargetExpected = 4;

        // Then
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.searchIndexOfTargetInArray(intValues, target);

        Assertions.assertEquals(indexOfTargetExpected, indexFound);
    }

    @Test
    public void shouldFindIndexOne() {
        // Given
        int[] intValues = {2, 5};

        // When
        int target = 5;
        int indexOfTargetExpected = 1;

        // Then
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.searchIndexOfTargetInArray(intValues, target);

        Assertions.assertEquals(indexOfTargetExpected, indexFound);
    }

    @Test
    public void shouldReturnMinusOneBecauseTargetWasNotFound() {
        // Given
        int[] intValues = {1, 2, 3, 4, 5, 6, 7};

        // When
        int target = 8;
        int indexOfTargetExpected = -1;

        // Then
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.searchIndexOfTargetInArray(intValues, target);

        Assertions.assertEquals(indexOfTargetExpected, indexFound);
    }

    @Test
    public void shouldReturnMinusOneTargetNotFound() {
        // Given
        int[] intValues = {2, 5};

        // When
        int target = 6;
        int indexOfTargetExpected = -1;

        // Then
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.searchIndexOfTargetInArray(intValues, target);

        Assertions.assertEquals(indexOfTargetExpected, indexFound);
    }

    @Test
    public void shouldFindIndexZero() {
        // Given
        int[] intValues = {-3, -2, -1, 0, 1, 2, 3};

        // When
        int target = -3;
        int indexOfTargetExpected = 0;

        // Then
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.searchIndexOfTargetInArray(intValues, target);

        Assertions.assertEquals(indexOfTargetExpected, indexFound);
    }

    @Test
    public void shouldFindIndexSix() {
        // Given
        int[] intValues = {-3, -2, -1, 0, 1, 2, 3};

        // When
        int target = 3;
        int indexOfTargetExpected = 6;

        // Then
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.searchIndexOfTargetInArray(intValues, target);

        Assertions.assertEquals(indexOfTargetExpected, indexFound);
    }

}
