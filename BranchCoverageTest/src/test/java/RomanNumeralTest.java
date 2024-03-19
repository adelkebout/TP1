import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralTest {

    @Test
    void testOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void testConversion() {
        assertEquals("III", RomanNumeral.toRoman(3));
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("LVIII", RomanNumeral.toRoman(58));
        assertEquals("MCMXCIV", RomanNumeral.toRoman(1994));
    }
}
