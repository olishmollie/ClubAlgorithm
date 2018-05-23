import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsPalindromeTest {

    @Test public void nullCase() {
        assertFalse("Solution should handle the null case", IsPalindrome.solution(null));
    }

    @Test public void emptyString() {
        assertFalse("Solution should handle an empty string", IsPalindrome.solution(""));
    }

    @Test public void shortStrings() {
        String[] tests = new String[]{
            "tacocat",
            "bob",
            "abba",
            "neato",
            "amanaplanacanalpanama",
            "banana"
        };
        boolean[] solutions = new boolean[]{ true, true, true, false, true, false };
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("Solution should return %b, got %b", tests[i], solutions[i]);
            assertEquals(msg, solutions[i], IsPalindrome.solution(tests[i]));
        }
    }
}
