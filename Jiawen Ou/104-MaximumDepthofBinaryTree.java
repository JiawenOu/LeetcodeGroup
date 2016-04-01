/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
    
        int res = 0;
        if (root == null){
            return 0;
        }
        else {
            res = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
            return res;
        }
    }
}
