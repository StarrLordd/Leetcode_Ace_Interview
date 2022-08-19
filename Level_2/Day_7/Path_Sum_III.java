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
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        return helper(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right, targetSum);
    }
    
    
    public int helper(TreeNode root, long sum) {
        if(root==null)
            return 0;
        int res=0;
        if(root.val==sum)
            res++;
        res+= helper(root.left,sum-root.val);
        res+= helper(root.right,sum-root.val);
        return res;
    }
}