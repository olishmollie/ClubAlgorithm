import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
    public final int tests[][] = {
        null,
        {},
        {0},
        {1, 2},
        {5, 7, 9, 11},
        {10, 20, 30, 40, 50, 50, 60}
    };
    public final int targets[] = { 0, -1, 0, 1, 13, 60};
    public final int solutions[] = {-1, -1, 0, 0, -1, 6};

    @Test public void testSolution() {
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("BinarySearch.solution should return %d", solutions[i]);
            assertEquals(msg, solutions[i], BinarySearch.solution(tests[i], targets[i]));
        }
    }
}