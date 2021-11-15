package majority_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    public void shouldReturnOne() {
        // Given
        int[] nums = { 1, 2, 3, 1, 2, 3, 1 };

        // When
        int expectedValue = 1;

        // Then
        MajorityElement majorityElement = new MajorityElement();
        int actualValue = majorityElement.getMajorityElement(nums);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnMinusFive() {
        // Given
        int[] nums = { -5, -5, -5, -5, 1, 5, 5, -5, 5, 5, -5 };

        // When
        int expectedValue = -5;

        // Then
        MajorityElement majorityElement = new MajorityElement();
        int actualValue = majorityElement.getMajorityElement(nums);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnTen() {
        // Given
        int[] nums = { 1, 1, 1, 10, 10, 10, 10, 3, 10, 1, 10 };

        // When
        int expectedValue = 10;

        // Then
        MajorityElement majorityElement = new MajorityElement();
        int actualValue = majorityElement.getMajorityElement(nums);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnZero() {
        // Given
        int[] nums = { 0, 0, 0, 1 };

        // When
        int expectedValue = 0;

        // Then
        MajorityElement majorityElement = new MajorityElement();
        int actualValue = majorityElement.getMajorityElement(nums);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnTwo() {
        // Given
        int[] nums = { 1, 2, 2 };

        // When
        int expectedValue = 2;

        // Then
        MajorityElement majorityElement = new MajorityElement();
        int actualValue = majorityElement.getMajorityElement(nums);

        Assertions.assertEquals(expectedValue, actualValue);
    }

}
