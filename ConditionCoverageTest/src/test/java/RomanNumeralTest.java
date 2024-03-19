

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {

    @Test
    public void testOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    public void testWithinRange() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("III", RomanNumeral.toRoman(3));
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("LVIII", RomanNumeral.toRoman(58));
        assertEquals("XCIX", RomanNumeral.toRoman(99));
        assertEquals("CDXCIX", RomanNumeral.toRoman(499));
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999));
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}
