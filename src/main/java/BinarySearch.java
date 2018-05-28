// Given a sorted array of integers, implement binary search.
public class BinarySearch {
    // Time complexity O(nlogn), space complexity O(1)
    public static int solution(int a[], int t) {
        if (a == null || a.length == 0) return -1;
        int low = 0, high = a.length-1;
        while (low <= high) {
            int mid = calculateMid(low, high);
            if (t == a[mid]) {
                return mid;
            } else if (t < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int calculateMid(int low, int high) {
        return low + (high-low)/2;
    }
}