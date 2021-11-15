package build_array_from_permutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuildArrayFromPermutationTest {

    @Test
    public void shouldReturn012453() {
        // Given
        int[] nums = { 0, 2, 1, 5, 3, 4 };

        // When
        int[] expectedArray = { 0, 1, 2, 4, 5, 3 };

        // Then
        BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
        int[] actualArray = buildArrayFromPermutation.buildArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldReturn450123() {
        // Given
        int[] nums = { 5, 0, 1, 2, 3, 4 };

        // When
        int[] expectedArray = { 4, 5, 0, 1, 2, 3 };

        // Then
        BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
        int[] actualArray = buildArrayFromPermutation.buildArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldReturn0123() {
        // Given
        int[] nums = { 0, 1, 2, 3 };

        // When
        int[] expectedArray = { 0, 1, 2, 3 };

        // Then
        BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
        int[] actualArray = buildArrayFromPermutation.buildArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldReturn01234() {
        // Given
        int[] nums = { 4, 3, 2, 1, 0 };

        // When
        int[] expectedArray = { 0, 1, 2, 3, 4 };

        // Then
        BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
        int[] actualArray = buildArrayFromPermutation.buildArray(nums);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

}
