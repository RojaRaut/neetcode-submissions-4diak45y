/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // base case
        if(subRoot == null) return true;
        if(root == null) return false;

        if(sametree(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean sametree(TreeNode root, TreeNode root2) {
        //base case:
        if(root == null && root2 == null) return true;
        if(root == null || root2 == null) return false;
        if(root.val != root2.val) return false;

        return sametree(root.left, root2.left) && sametree(root.right, root2.right);
    }
}
