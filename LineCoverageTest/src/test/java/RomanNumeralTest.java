import org.example.RomanNumeral;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test_data.csv", numLinesToSkip = 1)
    public void testRoman(int input, String expectedOutput) {
        assertEquals(expectedOutput, RomanNumeral.toRoman(input));
    }
}
