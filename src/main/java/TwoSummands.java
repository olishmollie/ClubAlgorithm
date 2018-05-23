import java.util.HashSet;
import java.util.HashMap;

// Given an array of integers and a sum, find the two elements in the array that add up to
// the given sum.
public class TwoSummands {
    // Time and space complexity O(n)
    public static HashSet<Integer> solution(int a[], int sum) {
        HashSet<Integer> result = new HashSet<>();
        if (a == null) { return result; }
        HashMap<Integer, Integer>m = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            int want = sum - a[i]; 
            if (m.get(want) != null) {
                result.add(a[i]);
                result.add(want);
                return result;
            } else {
                m.put(a[i], i);
            }
        }
        return result;
    }
}
