package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    @Test
    public void shouldReturn123() {
        // Given
        int[] nums = { 3, 2, 1 };

        // When
        int[] expectedArray = { 1, 2, 3 };

        // Then
        SelectionSort selectionSort = new SelectionSort();
        int[] actualArray = selectionSort.getSortedArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldReturn012() {
        // Given
        int[] nums = { 1, 0, 2 };

        // When
        int[] expectedArray = { 0, 1, 2 };

        // Then
        SelectionSort selectionSort = new SelectionSort();
        int[] actualArray = selectionSort.getSortedArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldReturn0123() {
        // Given
        int[] nums = { 2, 3, 0, 1 };

        // When
        int[] expectedArray = { 0, 1, 2, 3 };

        // Then
        SelectionSort selectionSort = new SelectionSort();
        int[] actualArray = selectionSort.getSortedArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

}
