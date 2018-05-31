public class BubbleSort {
    public static void solution(int[] a) throws IllegalArgumentException {
        if (a == null) throw new IllegalArgumentException("cannot sort a null array");
        int n = a.length;
        do { 
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (a[i-1] > a[i]) {
                    int tmp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = tmp;
                    newN = i;
                }
            }
            n = newN;
        } while (n != 0);
    }
}