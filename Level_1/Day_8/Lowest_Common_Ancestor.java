class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root!=null && p.val<root.val && q.val<root.val)
            root = lowestCommonAncestor(root.left,p,q);
        if(root!=null && p.val>root.val && q.val>root.val)
            root = lowestCommonAncestor(root.right,p,q);
        return root;
    }
}