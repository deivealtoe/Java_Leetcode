package squares_of_a_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquaresOfASortedArrayTest {

    @Test
    public void shouldReturnZeroOneNineSixteenOneHundred() {
        // Given
        int[] sortedArray = {-4, -1, 0, 3, 10};

        // When
        int[] arrayExpected = {0, 1, 9, 16, 100};

        // Then
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] sortedSquares = squaresOfASortedArray.sortedSquares(sortedArray);

        Assertions.assertArrayEquals(arrayExpected, sortedSquares);
    }

    @Test
    public void shouldReturnZeroOneOneFourNine() {
        // Given
        int[] sortedArray = {-3, -2, -1, 0, 1};

        // When
        int[] arrayExpected = {0, 1, 1, 4, 9};

        // Then
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] sortedSquares = squaresOfASortedArray.sortedSquares(sortedArray);

        Assertions.assertArrayEquals(arrayExpected, sortedSquares);
    }

    @Test
    public void shouldReturnSixteenFourtyNineEightOne() {
        // Given
        int[] sortedArray = {4, 7, 9};

        // When
        int[] arrayExpected = {16, 49, 81};

        // Then
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] sortedSquares = squaresOfASortedArray.sortedSquares(sortedArray);

        Assertions.assertArrayEquals(arrayExpected, sortedSquares);
    }

    @Test
    public void shouldReturnFourFourNineNine() {
        // Given
        int[] sortedArray = {-3, -2, 3, 2};

        // When
        int[] arrayExpected = {4, 4, 9, 9};

        // Then
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] sortedSquares = squaresOfASortedArray.sortedSquares(sortedArray);

        Assertions.assertArrayEquals(arrayExpected, sortedSquares);
    }

    @Test
    public void shouldReturnSixteenTwentyFive() {
        // Given
        int[] sortedArray = {-5, 4};

        // When
        int[] arrayExpected = {16, 25};

        // Then
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] sortedSquares = squaresOfASortedArray.sortedSquares(sortedArray);

        Assertions.assertArrayEquals(arrayExpected, sortedSquares);
    }

}
