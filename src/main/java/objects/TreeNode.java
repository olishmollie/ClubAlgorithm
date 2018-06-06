package objects;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(Integer v) { val = v; }

    public TreeNode(Integer[] a) {
        val = a[0];
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(this);
        int i = 1;
        while (i < a.length) {
            TreeNode curr = q.remove();
            if (a[i] != null) {
                curr.left = new TreeNode(a[i]);
                q.add(curr.left);
            }
            i++;
            if (a[i] != null) {
                curr.right = new TreeNode(a[i]);
                q.add(curr.right);
            }
            i++;
        }
    }
}