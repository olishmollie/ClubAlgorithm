import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

    @Test public void testCases() {
        int[][] tests = {
            { 5, 4, 3, 2, 1 },
            { 10, 14, 11, 59, 7, -2 },
            {}
        };
        int[][] solutions = {
            { 1, 2, 3, 4, 5 },
            { -2, 7, 10, 11, 14, 59 },
            {}
        };
        for (int i = 0; i < tests.length; i++) {
            BubbleSort.solution(tests[i]);
            assertArrayEquals(solutions[i], tests[i]);
        }
    }
}