class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode neNode=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=new ListNode(cur.val,neNode);
            neNode=temp;
            cur=cur.next;
        }
        return neNode;
    }
}