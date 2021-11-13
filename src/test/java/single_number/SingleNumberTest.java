package single_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    @Test
    public void shouldReturnOne() {
        // Given
        int[] nums = { 2, 2, 1 };

        // When
        int numExpected = 1;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

    @Test
    public void shouldReturnThree() {
        // Given
        int[] nums = { 1, 1, 2, 2, 3 };

        // When
        int numExpected = 3;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

    @Test
    public void shouldReturnFour() {
        // Given
        int[] nums = { 5, 1, 3, 4, 2, 5, 1, 3, 2 };

        // When
        int numExpected = 4;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

    @Test
    public void shouldReturnZero() {
        // Given
        int[] nums = { -1, 2, -1, 0, 2 };

        // When
        int numExpected = 0;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

    @Test
    public void shouldReturnMinusThree() {
        // Given
        int[] nums = { -3, -1, -2, -5, -2, -1, -5 };

        // When
        int numExpected = -3;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

    @Test
    public void shouldReturnMinusFour() {
        // Given
        int[] nums = { -4 };

        // When
        int numExpected = -4;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

    @Test
    public void shouldReturnMinusSixteen() {
        // Given
        int[] nums = { -16 };

        // When
        int numExpected = -16;

        // Then
        SingleNumber singleNumber = new SingleNumber();
        int actualNum = singleNumber.singleNumber(nums);

        Assertions.assertEquals(numExpected, actualNum);
    }

}
