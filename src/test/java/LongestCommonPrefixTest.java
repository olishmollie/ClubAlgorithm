import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", "", LongestCommonPrefix.solution(null));
    }

    @Test public void emptyArray() {
        assertEquals("solution should handle an empty array.", "", LongestCommonPrefix.solution(new String[]{}));
    }

    @Test public void testCases() {
        String[][] tests = {
            { "flower", "flow", "flight" },
            { "dog", "racecar", "car" },
            { "a" }
        };
        String[] solutions = { "fl", "", "a" };
        for (int i = 0; i < tests.length; i++) {
            assertEquals(solutions[i], LongestCommonPrefix.solution(tests[i]));
        }
    }
}