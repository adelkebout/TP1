import org.example.RomanNumeral;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
public class RomanNumeralTest {
    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv",numLinesToSkip = 1)
    public void tetsRoman(int input , String expectedoutput){
        assertEquals(expectedoutput , RomanNumeral.toRoman(input));

    }
}
