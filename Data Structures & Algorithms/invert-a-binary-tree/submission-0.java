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
    public TreeNode invertTree(TreeNode root) {
        // base case
        if(root == null) return null;
        // swap node elements
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        //invert left subtree
        invertTree(root.left);

        //ivert right subtree
        invertTree(root.right);

        return root;
    }
}
