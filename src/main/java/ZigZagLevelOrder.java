import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

import objects.TreeNode;

public class ZigZagLevelOrder {
    // Definition for TreeNode
    // public class TreeNode {
    //     public int val;
    //     public TreeNode left;
    //     public TreeNode right;
    //     TreeNode(int v) { val = v; }
    // }
    public static List<List<Integer>> solution(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root != null) {
            Queue<TreeNode> q = new ArrayDeque<>();
            q.add(root);
            boolean reverse = false;
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> inner = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.remove();
                    inner.add(curr.val);
                    if (curr.left != null) {
                        q.add(curr.left);
                    } if (curr.right != null) {
                        q.add(curr.right);
                    }
                } 
                if (reverse) {
                    Collections.reverse(inner);
                }
                ans.add(inner);
                reverse = !reverse;
            }
        }
        return ans;
    }
}