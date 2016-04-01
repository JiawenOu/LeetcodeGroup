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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean res;
        
        if (p == null && q == null) {
            res = true;
        }
        else if (p != null && q != null && p.val == q.val) {
            res = isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
        }
        else {
            res = false;
        }
        
        return res;
        
    }
}