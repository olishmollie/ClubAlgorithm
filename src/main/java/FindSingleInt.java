import java.util.HashMap;

// You are given an array of integers where every digit has a repeat except one. 
// Find the index of that integer.
public class FindSingleInt {
    public static int solution(int a[]) {
        if (a == null || a.length == 0) return -1;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i])) {
                m.remove(a[i]);
            } else {
                m.put(a[i], 1);
            }
        }
        return (Integer)m.keySet().toArray()[0];
    }
}