import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import objects.TreeNode;

public class ZigZagLevelOrderTest {

    @Test public void nullCase() {
        assertEquals("solution should handle the null case.", new ArrayList<List<Integer>>(), ZigZagLevelOrder.solution(null));
    }

    @Test public void testOne() {
        Integer[] a = {3, 9, 20, null, null, 15, 7};
        TreeNode root = new TreeNode(a);
        Integer[][] s = {
            { 3 },
            { 20, 9 },
            { 15, 7 }
        };
        assertEquals(makeSolution(s), ZigZagLevelOrder.solution(root));
    }

    @Test public void testTwo() {
        Integer[] a = {1, 2, 3, 4, 5};
        TreeNode root = new TreeNode(a);
        Integer[][] s = {
            { 1 },
            { 3, 2 },
            { 4, 5 }
        };
        assertEquals(makeSolution(s), ZigZagLevelOrder.solution(root));
    }

    private List<List<Integer>> makeSolution(Integer[][] a) {
        List<List<Integer>> solution = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            solution.add(Arrays.asList(a[i]));
        }
        return solution;
    }

}