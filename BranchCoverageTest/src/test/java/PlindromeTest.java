

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindromeWithNull() {
        // Test 1: Vérifie que la méthode lance une NullPointerException pour une entrée null
        Assertions.assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void testIsPalindromeWithNonPalindrome() {
        // Test 2: Teste une chaîne qui n'est pas un palindrome
        Assertions.assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testIsPalindromeWithPalindrome() {
        // Test 3: Teste une chaîne qui est un palindrome, en ignorant la casse et les espaces
        Assertions.assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testIsPalindromeWithEmptyString() {
        // Test 4: Teste une chaîne vide, qui est techniquement un palindrome
        Assertions.assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testIsPalindromeWithSpacesOnly() {
        // Test 5: Teste une chaîne qui contient uniquement des espaces
        Assertions.assertTrue(Palindrome.isPalindrome("     "));
    }
}
