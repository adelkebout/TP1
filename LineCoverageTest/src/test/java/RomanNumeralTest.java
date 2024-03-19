import org.example.RomanNumeral;
import org.example.RomanNumeralcorraction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test_data.csv", numLinesToSkip = 1)
    public void testRoman(int input, String expectedOutput) {
        assertEquals(expectedOutput, RomanNumeralcorraction.toRoman(input));
    }
    @Test
    public void testToRoman() {
        // Test with coverage for each line of the method toRoman

        // Test input 1
        assertEquals("I", RomanNumeralcorraction.toRoman(1));

        // Test input 5
        assertEquals("V", RomanNumeralcorraction.toRoman(5));

        // Test input 10
        assertEquals("X", RomanNumeralcorraction.toRoman(10));

        // Test input 50
        assertEquals("L", RomanNumeralcorraction.toRoman(50));

        // Test input 100
        assertEquals("C", RomanNumeralcorraction.toRoman(100));

        // Test input 500
        assertEquals("D", RomanNumeralcorraction.toRoman(500));

        // Test input 1000
        assertEquals("M", RomanNumeralcorraction.toRoman(1000));

        // Test input 3999
        assertEquals("MMMCMXCIX", RomanNumeralcorraction.toRoman(3999));

        // Test input out of range
        try {
            RomanNumeralcorraction.toRoman(0);
            fail("Expected IllegalArgumentException for n = 0");
        } catch (IllegalArgumentException e) {
            // Expected exception for n = 0
        }

        try {
            RomanNumeralcorraction.toRoman(4000);
            fail("Expected IllegalArgumentException for n = 4000");
        } catch (IllegalArgumentException e) {
            // Expected exception for n = 4000
        }
    }
}
