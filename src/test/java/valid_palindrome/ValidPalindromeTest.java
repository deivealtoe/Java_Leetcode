package valid_palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void shouldReturnTrueOne() {
        // Given
        String s = "A man, a plan, a canal: Panama";

        // Then
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isValidPalindrome(s);

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseOne() {
        // Given
        String s = "race a car";

        // Then
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isValidPalindrome(s);

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldReturnTrueTwo() {
        // Given
        String s = " ";

        // Then
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isValidPalindrome(s);

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseTwo() {
        // Given
        String s = " ab";

        // Then
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isValidPalindrome(s);

        Assertions.assertFalse(actual);
    }

}
