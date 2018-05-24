import java.util.HashSet;
import java.util.HashMap;

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example
// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

public class TwoSummands {
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
