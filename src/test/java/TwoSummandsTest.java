import static org.junit.Assert.assertEquals;

import org.junit.Test;

import objects.TestArray;

public class TwoSummandsTest {


    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", new TestArray(new int[]{}), TwoSummands.solution(null, 0));
    }

    @Test public void emptyArray() {
        assertEquals("solution should handle an empty array.", new TestArray(new int[]{}), TwoSummands.solution(null, 0));
    }

    @Test public void testCases() {
        int tests[][] = new int[][]{
            { 10, 3, 5, 2, 9, 22, 1 },
            { 5, 2, 7, -2, -4, 8, 6 },
            { 10, 20, 30, 40, 50, 50 }
        };
        int sums[] = { 4, 5, 100 };
        TestArray[] solutions = {
            new TestArray(new int[]{ 1, 6 }),
            new TestArray(new int[]{ 2, 3 }),
            new TestArray(new int[]{ 4, 5 })
        };

        for (int i = 0; i < tests.length; i++) {
            int[] solution = TwoSummands.solution(tests[i], sums[i]);
            String msg = String.format("solution should return %s, got %s.", solutions[i], solution);
            assertEquals(msg, solutions[i], solution);
        }
    }
}