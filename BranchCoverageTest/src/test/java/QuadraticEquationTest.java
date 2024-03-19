import org.example.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {

    @Test
    public void testAIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
    }

    @Test
    public void testDeltaNegative() {
        double[] result = QuadraticEquation.solve(1, 2, 3);
        Assertions.assertNull(result);
    }

    @Test
    public void testDeltaZero() {
        double[] result = QuadraticEquation.solve(1, 2, 1);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(-1.0, result[0], 0.001);
    }

    @Test
    public void testDeltaPositive() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.length);
        Assertions.assertArrayEquals(new double[]{2.0, 1.0}, result, 0.001);
    }
}
