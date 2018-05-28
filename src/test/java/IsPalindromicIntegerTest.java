import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsPalindromicIntegerTest {

    @Test public void palindrome() {
        assertTrue(IsPalindromicInteger.solution(100001));
    }

    @Test public void notPalindrome() {
        assertFalse(IsPalindromicInteger.solution(400023));
    }

    @Test public void overflow() {
        assertFalse(IsPalindromicInteger.solution(Integer.MAX_VALUE));
    }
}