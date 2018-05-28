import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AToITest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", 0, AToI.solution(null));
    }

    @Test public void emptyString() {
        assertEquals("solution should handle an empty string.", 0, AToI.solution(""));
    }

    @Test public void positiveInteger() {
        assertEquals(42, AToI.solution("42"));
    }

    @Test public void negativeInteger() {
        assertEquals(-42, AToI.solution("-42"));
    }

    @Test public void wordsBefore() {
        assertEquals(0, AToI.solution("words before 922"));
    }

    @Test public void wordsAfter() {
        assertEquals(922, AToI.solution("922 words after"));
    }

    @Test public void whitespaceBefore() {
        assertEquals(4023, AToI.solution("    4023"));
    }

    @Test public void whitespaceMiddle() {
        assertEquals(42, AToI.solution("42 49"));
    }

    @Test public void whitespaceAfter() {
        assertEquals(500, AToI.solution("500       "));
    }

    @Test public void positiveOverflow() {
        assertEquals(Integer.MAX_VALUE, AToI.solution("9903473874834"));
    }

    @Test public void superOverflow() {
        assertEquals(Integer.MAX_VALUE, AToI.solution("9223372036854775808"));
    }

    @Test public void negativeOverflow() {
        assertEquals(Integer.MIN_VALUE, AToI.solution("-9903473874834"));
    }

    @Test public void optionalPlus() {
        assertEquals(432, AToI.solution("+432"));
    }

    @Test public void leadingZeroes() {
        assertEquals(-1, AToI.solution("-000000000000000000001"));
    }
}