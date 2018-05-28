import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IToSTest {

    @Test public void positiveInteger() {
        assertEquals("42", IToS.solution(42));
    }

    @Test public void negativeInteger() {
        assertEquals("-42", IToS.solution(-42));
    }

    @Test public void biggerInteger() {
        assertEquals(String.format("%d", Integer.MAX_VALUE), IToS.solution(Integer.MAX_VALUE));
    }

}