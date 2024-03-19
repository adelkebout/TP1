

import org.example.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    public void testNullStrings() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    public void testDifferentLengthStrings() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    public void testAnagramStrings() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }
}
