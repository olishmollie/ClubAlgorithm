public class InsertionSort {
    public static void solution(int[] a) throws IllegalArgumentException {
        if (a == null) throw new IllegalArgumentException("cannot sort a null array");
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j-1;
            while (i >= 0 && a[i] > key) {
                a[i+1] = a[i--];
            }
            a[i+1] = key;
        }       
    }
}