import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringTest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", 0, LongestSubstring.solution(null));
    }

    @Test public void emptyString() {
        assertEquals("solution should handle an empty string.", 0, LongestSubstring.solution(""));
    }

    @Test public void singleChar() {
        assertEquals("solution should handle a string of a single character", 1, LongestSubstring.solution("a"));
    }

    @Test public void testCases() {
        String[] tests = {
            "abcabcbb",
            "bbbbbb",
            "dvdf",
            "pwwkew",
            "aab"
        };
        int[] solutions = { 3, 1, 3, 3, 2 };
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("solution failed for string \"%s\"", tests[i]);
            assertEquals(msg, solutions[i], LongestSubstring.solution(tests[i]));
        }
    }
}
