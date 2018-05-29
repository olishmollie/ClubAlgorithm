import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperReducedStringTest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", "Empty String", SuperReducedString.solution(null));
    }

    @Test public void emptyString() {
        assertEquals("solution should handle an empty string.", "Empty String", SuperReducedString.solution(""));
    }

    @Test public void testCases() {
        String[] tests = {
            "aaabccddd",
            "baab",
            "aa"
        };
        String[] solutions = {
            "abd",
            "Empty String",
            "Empty String"
        };
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("incorrect solution for '%s'.", tests[i]);
            assertEquals(msg, solutions[i], SuperReducedString.solution(tests[i]));
        }
    }

}