
import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    public void testAEqualsZero() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 3));
    }

    @Test
    public void testDeltaLessThanZero() {
        assertNull(QuadraticEquation.solve(1, 2, 3));
    }

    @Test
    public void testDeltaEqualsZero() {
        assertArrayEquals(new double[]{-1.0}, QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    public void testDeltaGreaterThanZero() {
        assertArrayEquals(new double[]{-1.0, -2.0}, QuadraticEquation.solve(1, 3, 2));
    }
}
