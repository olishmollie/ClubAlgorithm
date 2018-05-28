import static org.junit.Assert.assertEquals;

import org.junit.Test;

import objects.TestArray;

public class ReverseArrayTest {

    @Test public void emptyArray() {
        int a[] = new int[]{};
        ReverseArray.solution(a);
        assertEquals("solution should handle an empty array.", new TestArray(new int[]{}), a);
    }

    @Test public void testCases() {
        int[][] tests = {
            new int[]{ 1, 2, 3, 4, 5 },
            new int[]{ 500, 400, 32, 105, 78 }
        };
        TestArray[] solutions = {
            new TestArray(new int[]{ 5, 4, 3, 2, 1 }),
            new TestArray(new int[]{ 78, 105, 32, 400, 500 })
        };
        for (int i = 0; i < tests.length; i++) {
            ReverseArray.solution(tests[i]);
            assertEquals(solutions[i], tests[i]);
        }
    }
}