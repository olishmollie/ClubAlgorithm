// Given an array of integers, reverse it in place.

public class ReverseArray {
    public static void solution(int[] a) {
        if (a != null) {
            int i = 0, j = a.length-1;
            while (i < j) {
                int tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
    }
}