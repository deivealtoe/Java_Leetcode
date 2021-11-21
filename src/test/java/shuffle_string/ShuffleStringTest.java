package shuffle_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleStringTest {

    @Test
    public void shouldReturnABC() {
        // Given
        String s = "abc";
        int[] indices = { 0, 1, 2 };

        // When
        String expected = "abc";

        // Then
        ShuffleString shuffleString = new ShuffleString();
        String actual = shuffleString.shuffleString(s, indices);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnLEETCODE() {
        // Given
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

        // When
        String expected = "leetcode";

        // Then
        ShuffleString shuffleString = new ShuffleString();
        String actual = shuffleString.shuffleString(s, indices);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNIHAO() {
        // Given
        String s = "aiohn";
        int[] indices = { 3, 1, 4, 2, 0 };

        // When
        String expected = "nihao";

        // Then
        ShuffleString shuffleString = new ShuffleString();
        String actual = shuffleString.shuffleString(s, indices);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnARIGATOU() {
        // Given
        String s = "aaiougrt";
        int[] indices = { 4, 0, 2, 6, 7, 3, 1, 5 };

        // When
        String expected = "arigatou";

        // Then
        ShuffleString shuffleString = new ShuffleString();
        String actual = shuffleString.shuffleString(s, indices);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRAT() {
        // Given
        String s = "art";
        int[] indices = { 1, 0, 2 };

        // When
        String expected = "rat";

        // Then
        ShuffleString shuffleString = new ShuffleString();
        String actual = shuffleString.shuffleString(s, indices);

        Assertions.assertEquals(expected, actual);
    }

}
