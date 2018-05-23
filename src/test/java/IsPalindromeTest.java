import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsPalindromeTest {
    public final String tests[] = {
        "tacocat",
        "bob",
        "abba",
        "neato",
        "amanaplanacanalpanama",
        "banana"
    };
    public final boolean solutions[] = { true, true, true, false, true, false };
    @Test public void testSolution() {
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("IsPalindrome.solution(%s) should be %b", tests[i], solutions[i]);
            assertEquals(msg, solutions[i], IsPalindrome.solution(tests[i]));
        }
    }
}
