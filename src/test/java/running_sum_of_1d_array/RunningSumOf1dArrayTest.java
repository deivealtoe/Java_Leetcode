package running_sum_of_1d_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {

    @Test
    public void shouldReturn13610() {
        // Given
        int[] nums = { 1, 2, 3, 4 };

        // When
        int[] expected = { 1, 3, 6, 10 };

        // Then
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        int[] actual = runningSumOf1dArray.runningSum(nums);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn11111() {
        // Given
        int[] nums = { 1, 1, 1, 1, 1 };

        // When
        int[] expected = { 1, 2, 3, 4, 5 };

        // Then
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        int[] actual = runningSumOf1dArray.runningSum(nums);

        Assertions.assertArrayEquals(expected, actual);
    }

}
