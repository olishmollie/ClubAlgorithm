package objects;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode fromArray(int[] a) {
        if (a == null || a.length == 0) return null;
        ListNode l = new ListNode(a[0]);
        ListNode curr = l;
        for (int i = 1; i < a.length; i++) {
            curr.next = new ListNode(a[i]);
            curr = curr.next;
        }
        return l;
    }
    
    @Override public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }
        ListNode l = (ListNode) o;
        ListNode a = this;
        ListNode b = l;
        while (a != null) {
            if (a.val != b.val) {
                return false;
            }
            a = a.next; b = b.next;
        }
        if (b != null) {
            return false;
        }
        return true;
    }

    @Override public String toString() {
        String result = "(";
        ListNode curr = this;
        while (curr != null) {
            String delim = curr.next != null ? "->" : "";
            result += curr.val + delim;
            curr = curr.next;
        }
        result += ")";
        return result;
    }
}
