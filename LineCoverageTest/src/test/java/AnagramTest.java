import org.example.Anagram;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.example.palisndromecorrection.isPalindrome;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagramshouldreturnTrueIfTheInputIsanagram() {

        assertTrue(Anagram.isAnagram("chien", "niche"));
        //assertTrue(Anagram.isAnagram("listen", "silent"));
       // assertTrue(Anagram.isAnagram("rail safety", "fairy tales"));

    }
    @Test
    public void isAnagramshouldreturnFalseIfTheInputIsNotanagram(){
        assertFalse(Anagram.isAnagram("hello", "world"));

    }
    @Test
    public void isAnagramshouldreturnFalseIfTheInputsAreNotequaleInlenght() {
        assertFalse(Anagram.isAnagram("hellom", "world"));

    }
    @Test

    public void IsPalindrommeShouldReturnExeptionIfTheInputsArenull()
    {
        Assertions.assertThrows(NullPointerException.class,() -> Anagram.isAnagram(null, null));

    }

}
