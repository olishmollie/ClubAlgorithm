import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSingleIntTest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", -1, FindSingleInt.solution(null));
    }

    @Test public void emptyArray() {
        int[] a = new int[]{};
        assertEquals("solution should handle an empty array.", -1, FindSingleInt.solution(a));
    }

    @Test public void singleElement() {
        int[] a = new int[]{0};
        assertEquals("solution should handle an array of length 1.", 0, FindSingleInt.solution(a));
    }

    @Test public void shortArrays() {
        int tests[][] = new int[][]{
            { 1, 1, 2 },
            { 3, 5, 3, 4, 4, 2, 2 },
            { 5, 8, 9, 9, 5, 8, 7, 7, 4, 2, 1, 10, 1, 2, 10 }
        };
        int solutions[] = new int[]{ 2, 5, 4 };
        for (int i = 0; i < tests.length; i++) {
            int solution = FindSingleInt.solution(tests[i]);
            String msg = String.format("solution should return %d, got %d.", solutions[i], solution);
            assertEquals(msg, solutions[i], solution);
        }
    }
}