import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSingleIntTest {
    public final int tests[][] = {
        null,
        {},
        { 1, 1, 2 },
        { 3, 5, 3, 4, 4, 2, 2 },
        { 5, 8, 9, 9, 5, 8, 7, 7, 4, 2, 1, 10, 1, 2, 10 }
    };
    public final int solutions[] = { -1, -1, 2, 5, 4 };
    @Test public void testSolution() {
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("FindSingleInt.solution should return %d", solutions[i]);
            assertEquals(msg, solutions[i], FindSingleInt.solution(tests[i]));
        }
    }
}