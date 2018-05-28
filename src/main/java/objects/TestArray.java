package objects;

public class TestArray {
    private int[] arr;
    public int length;
    public TestArray(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    @Override public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof int[])) {
            return false;
        }
        int[] arr = (int[]) o;
        if (arr.length != this.length) {
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            if (this.arr[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}