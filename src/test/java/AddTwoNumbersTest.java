import static org.junit.Assert.assertEquals;

import org.junit.Test;

import objects.ListNode;

public class AddTwoNumbersTest {

    @Test public void differentLengths() {
        int[] a1 = new int[]{ 0, 1 };
        int[] a2 = new int[]{ 0, 1, 2 };
        int [] s = new int[]{ 0, 2, 2 };
        ListNode p = ListNode.fromArray(a1);
        ListNode q = ListNode.fromArray(a2);
        ListNode want = ListNode.fromArray(s);
        ListNode solution = AddTwoNumbers.solution(p, q);
        String msg = String.format("input: %s, %s", p, q);
        assertEquals(msg, want, solution);
    }

    @Test public void oneNullList() {
        int[] a = new int[]{ 0, 1 };
        ListNode want = ListNode.fromArray(a);
        ListNode solution = AddTwoNumbers.solution(want, null);
        String msg = String.format("input: %s, ()", want);
        assertEquals(msg, want, solution);
    }

    @Test public void overflow() {
        int[] a = new int[]{ 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int[] b = new int[]{ 1 }; 
        int[] s = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        ListNode p = ListNode.fromArray(a);
        ListNode q = ListNode.fromArray(b);
        ListNode want = ListNode.fromArray(s);
        ListNode solution = AddTwoNumbers.solution(p, q); 
        String msg = String.format("input: %s, %s", p, q);
        assertEquals(msg, want, solution);
    }

    @Test public void carry() {
        int[] a = new int[]{ 5 };
        int[] s = new int[] { 0, 1 };
        ListNode p = ListNode.fromArray(a);
        ListNode q = ListNode.fromArray(a);
        ListNode want = ListNode.fromArray(s);
        ListNode solution = AddTwoNumbers.solution(p, q);
        String msg = String.format("input: %s, %s", p, q);
        assertEquals(msg, want, solution);
    }
}
