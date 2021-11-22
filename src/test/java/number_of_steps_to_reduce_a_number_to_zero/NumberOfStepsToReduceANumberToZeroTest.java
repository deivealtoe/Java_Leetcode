package number_of_steps_to_reduce_a_number_to_zero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfStepsToReduceANumberToZeroTest {

    @Test
    public void shouldReturn6() {
        // Given
        int num = 14;

        // When
        int expected = 6;

        // Then
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        int actual = numberOfStepsToReduceANumberToZero.getAmountOfSteps(num);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn4() {
        // Given
        int num = 8;

        // When
        int expected = 4;

        // Then
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        int actual = numberOfStepsToReduceANumberToZero.getAmountOfSteps(num);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn12() {
        // Given
        int num = 123;

        // When
        int expected = 12;

        // Then
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        int actual = numberOfStepsToReduceANumberToZero.getAmountOfSteps(num);

        Assertions.assertEquals(expected, actual);
    }

}
