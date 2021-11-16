package jewels_and_stones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JewelsAndStonesTest {

    @Test
    public void shouldReturn3() {
        // Given
        String jewels = "aA";
        String stones = "aAAbbbb";

        // When
        int expected = 3;

        // Then
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        int actual = jewelsAndStones.getHowManyStonesAreJewels(jewels, stones);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn4() {
        // Given
        String jewels = "Aa";
        String stones = "bbbbaAAA";

        // When
        int expected = 4;

        // Then
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        int actual = jewelsAndStones.getHowManyStonesAreJewels(jewels, stones);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0() {
        // Given
        String jewels = "aA";
        String stones = "ccvvqqDDbbbb";

        // When
        int expected = 0;

        // Then
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        int actual = jewelsAndStones.getHowManyStonesAreJewels(jewels, stones);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn8() {
        // Given
        String jewels = "p";
        String stones = "papbpcpdpeptpyp";

        // When
        int expected = 8;

        // Then
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        int actual = jewelsAndStones.getHowManyStonesAreJewels(jewels, stones);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1() {
        // Given
        String jewels = "h";
        String stones = "eqwrtggfdxchv";

        // When
        int expected = 1;

        // Then
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        int actual = jewelsAndStones.getHowManyStonesAreJewels(jewels, stones);

        Assertions.assertEquals(expected, actual);
    }

}
