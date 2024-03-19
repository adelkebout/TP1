import org.example.FizzBuzz;
import org.example.FizzBuzzcorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("1", FizzBuzzcorrection.fizzBuzz(1)); // Ce test passera si vous avez supprimé la contrainte n <= 1.
        assertEquals("FizzBuzz", FizzBuzzcorrection.fizzBuzz(15));
        assertEquals("Fizz", FizzBuzzcorrection.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzzcorrection.fizzBuzz(5));
        assertEquals("2", FizzBuzzcorrection.fizzBuzz(2));
        assertEquals("FizzBuzz", FizzBuzzcorrection.fizzBuzz(30));
        // Ajouter des cas de test pour les valeurs inférieures si nécessaire.
    }

    // Si vous souhaitez tester le comportement de la méthode pour des valeurs non valides (comme n <= 0)
    @Test
    public void testFizzBuzzForInvalidValues() {

        assertThrows(IllegalArgumentException.class, () -> FizzBuzzcorrection.fizzBuzz(-1));
    }
}
