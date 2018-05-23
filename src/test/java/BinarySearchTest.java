import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test public void nullCase() {
        assertEquals("Solution should handle the null case", -1, BinarySearch.solution(null, 0));
    }

    @Test public void emptyArray() {
        int a[] = new int[]{};
        assertEquals("Solution should handle an empty array", -1, BinarySearch.solution(a, 0));
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
            String msg = String.format("Solution should return %d, got %d", solutions[i], solution);
            assertEquals(msg, solutions[i], solution);
        }
    }

    @Test public void longArrays() {
        int[] test = new int[Integer.MAX_VALUE/100];
        for (int i = 0; i < test.length; i++) {
            test[i] = i;
        }
        int target = Integer.MAX_VALUE/100 - 1;
        int solution = BinarySearch.solution(test, target);
        String msg = String.format("Solution should return %d, got %d", target, solution);
        assertEquals(msg, target, solution);
    }
}