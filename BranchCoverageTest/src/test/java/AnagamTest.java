import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testIsAnagramWithBothNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    void testIsAnagramWithFirstNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }

    @Test
    void testIsAnagramWithSecondNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testIsAnagramWithDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testIsAnagramWithSameStrings() {
        assertTrue(Anagram.isAnagram("listen", "listen"));
    }

    @Test
    void testIsAnagramWithCaseAndSpaceInsensitive() {
        assertTrue(Anagram.isAnagram("A gentleman", "Elegant man"));
    }

    @Test
    void testIsAnagramWithDifferentStringsSameLength() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    void testIsAnagramWithActualAnagrams() {
        assertTrue(Anagram.isAnagram("cinema", "iceman"));
    }
}
