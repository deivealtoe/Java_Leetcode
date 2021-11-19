package concatenation_of_array;

import concatenation_of_araray.ConcatenationOfArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcatenationOfArrayTest {

    @Test
    public void shouldReturn121121() {
        // Given
        int[] nums = { 1, 2, 1 };

        // When
        int[] expected = { 1, 2, 1, 1, 2, 1 };

        // Then
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] actual = concatenationOfArray.concatenate(nums);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn13211321() {
        // Given
        int[] nums = { 1, 3, 2, 1 };

        // When
        int[] expected = { 1, 3, 2, 1, 1, 3, 2, 1 };

        // Then
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] actual = concatenationOfArray.concatenate(nums);

        Assertions.assertArrayEquals(expected, actual);
    }

}
