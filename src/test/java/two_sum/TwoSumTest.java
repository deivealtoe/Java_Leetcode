package two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {

    public boolean containsInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }

        return false;
    }

    @Test
    public void shouldReturnZeroAndOne() {
        // Given
        int[] nums = { 2, 7, 11, 15 };

        // When
        int target = 9;

        // Then
        TwoSum twoSum = new TwoSum();
        int[] actualIndices = twoSum.twoSum(nums, target);

        Assertions.assertTrue(this.containsInArray(actualIndices, 0));
        Assertions.assertTrue(this.containsInArray(actualIndices, 1));
    }

    @Test
    public void shouldReturnOneAndTwo() {
        // Given
        int[] nums = { 2, 7, 11, 15 };

        // When
        int target = 18;

        // Then
        TwoSum twoSum = new TwoSum();
        int[] actualIndices = twoSum.twoSum(nums, target);

        Assertions.assertTrue(this.containsInArray(actualIndices, 1));
        Assertions.assertTrue(this.containsInArray(actualIndices, 2));
    }

    @Test
    public void shouldReturnTwoAndThree() {
        // Given
        int[] nums = { 2, 7, 11, 15 };

        // When
        int target = 26;

        // Then
        TwoSum twoSum = new TwoSum();
        int[] actualIndices = twoSum.twoSum(nums, target);

        Assertions.assertTrue(this.containsInArray(actualIndices, 2));
        Assertions.assertTrue(this.containsInArray(actualIndices, 3));
    }

    @Test
    public void shouldReturnZeroAndTwo() {
        // Given
        int[] nums = { 2, 7, 11, 15 };

        // When
        int target = 13;

        // Then
        TwoSum twoSum = new TwoSum();
        int[] actualIndices = twoSum.twoSum(nums, target);

        Assertions.assertTrue(this.containsInArray(actualIndices, 0));
        Assertions.assertTrue(this.containsInArray(actualIndices, 2));
    }

    @Test
    public void shouldReturnOneAndThree() {
        // Given
        int[] nums = { 2, 7, 11, 15 };

        // When
        int target = 22;

        // Then
        TwoSum twoSum = new TwoSum();
        int[] actualIndices = twoSum.twoSum(nums, target);

        Assertions.assertTrue(this.containsInArray(actualIndices, 1));
        Assertions.assertTrue(this.containsInArray(actualIndices, 3));
    }

}
