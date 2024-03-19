

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testPalindromeString() {
        assertTrue(Palindrome.isPalindrome("radar"));
    }

    @Test
    public void testNonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }
}
