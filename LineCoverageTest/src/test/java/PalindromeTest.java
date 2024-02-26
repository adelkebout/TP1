import org.example.Palindrome;
import static org.example.palisndromecorrection.isPalindrome;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void IsPalindrommeShouldReturnTrueIfTheInputIsPalindromme() {

        assertTrue(isPalindrome("kayak"));

        assertTrue(isPalindrome("Esope reste ici et se repose"));



    }
    @Test
    public void IsPalindrommeShouldReturnExeptionIfTheInputnull()
    {
        Assertions.assertThrows(NullPointerException.class,() -> isPalindrome(null));

    }
   @Test
    public void IsPalindrommeShouldReturnflaseIfTheInputIsNoPalindromme() {

        assertFalse(isPalindrome("adl"));
    }
}
