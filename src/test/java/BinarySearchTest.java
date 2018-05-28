import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", -1, BinarySearch.solution(null, 0));
    }

    @Test public void emptyArray() {
        int a[] = new int[]{};
        assertEquals("solution should handle an empty array.", -1, BinarySearch.solution(a, 0));
    }

    @Test public void shortArrays() {
        int[][] tests = new int[][]{
            {0},
            {1, 2},
            {5, 7, 9, 11},
            {10, 20, 30, 40, 50, 50, 60}
        };
        int[] targets = new int[]{0, 1, 13, 60};
        int[] solutions = new int[]{0, 0, -1, 6};
        for (int i = 0; i < tests.length; i++) {
            int solution = BinarySearch.solution(tests[i], targets[i]);
            String msg = String.format("solution should return %d, got %d.", solutions[i], solution);
            assertEquals(msg, solutions[i], solution);
        }
    }

    @Test public void overflow() {
        int low = Integer.MAX_VALUE/2, high = Integer.MAX_VALUE;
        assertEquals(1610612735, BinarySearch.calculateMid(low, high));
    }
}