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
    boolean isBal=true;
    public boolean isBalanced(TreeNode root) {
        balRoot(root);
        return isBal;
    }
    public int balRoot(TreeNode root){
        if(root==null) return 0;
        int lh=balRoot(root.left);
        int rh=balRoot(root.right);
        
        int gap=Math.abs(lh-rh);
        if(gap>1) isBal=false;
        int th=Math.max(lh,rh)+1;
        return th;
    }
}