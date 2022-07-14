
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    public void helper(Node root, List<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.val);
        for(Node temp:root.children){
            helper(temp,ans);
        }
    }
}