import org.example.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearchElementFound() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 3;
        int expectedIndex = 2;
        int result = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchElementNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;
        int expectedResult = -1;
        int result = BinarySearch.binarySearch(array, element);
        assertEquals(expectedResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testBinarySearchNullArray() {
        BinarySearch.binarySearch(null, 5);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int element = 5;
        int expectedResult = -1;
        int result = BinarySearch.binarySearch(array, element);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testBinarySearchSingleElementArray() {
        int[] array = {5};
        int element = 5;
        int expectedResult = 0;
        int result = BinarySearch.binarySearch(array, element);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testBinarySearchElementInFirstPosition() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 1;
        int expectedResult = 0;
        int result = BinarySearch.binarySearch(array, element);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testBinarySearchElementInLastPosition() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 5;
        int expectedResult = 4;
        int result = BinarySearch.binarySearch(array, element);
        assertEquals(expectedResult, result);
    }
}
