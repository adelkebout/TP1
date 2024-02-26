import org.example.QuadraticEquation;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticEquationTest {

    @Test
    public void testSolveWithRealRoots() {
        double a = 1;
        double b = -3;
        double c = 2;
        double[] expectedRoots = {2, 1};
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(expectedRoots, roots, 0.0001);
    }

    @Test
    public void testSolveWithEqualRoots() {
        double a = 1;
        double b = -2;
        double c = 1;
        double[] expectedRoots = {1};
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(expectedRoots, roots, 0.0001);
    }

    @Test
    public void testSolveWithNoRealRoots() {
        double a = 2;
        double b = 4;
        double c = 5;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertNull(roots);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithZeroA() {
        double a = 0;
        double b = 4;
        double c = 5;
        QuadraticEquation.solve(a, b, c);
    }
}
