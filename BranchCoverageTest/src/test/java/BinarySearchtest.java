

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchcorrectionTest {

    @Test
    void testBinarySearchWithNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testBinarySearchWithElementInMiddle() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testBinarySearchWithElementAtStart() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testBinarySearchWithElementAtEnd() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(4, BinarySearch.binarySearch(array, 9));
    }

    @Test
    void testBinarySearchWithElementNotInArrayAndLeft() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(-1, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testBinarySearchWithElementNotInArrayAndRight() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(-1, BinarySearch.binarySearch(array, 11));
    }

    @Test
    void testBinarySearchWithEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }
}
