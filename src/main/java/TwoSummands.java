import java.util.HashMap;

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example
// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

public class TwoSummands {
    public static int[] solution(int a[], int sum) {
        if (a == null) return new int[]{};
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            int diff = sum - a[i]; 
            Integer j;
            if ((j = m.get(diff)) != null) {
                return new int[]{ j, i };
            } else {
                m.put(a[i], i);
            }
        }
        return new int[]{};
    }
}
