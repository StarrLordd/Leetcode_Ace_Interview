class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null || list2==null) return list1!=null?list1:list2;
        
        ListNode c1=list1, c2=list2;
        ListNode d=new ListNode();
        ListNode prev=d;
        while(c1!=null&&c2!=null){
            if(c1.val<c2.val){
                prev.next=c1;
                c1=c1.next;
            }else{
                prev.next=c2;
                c2=c2.next;
            }
            prev=prev.next;
        }
        if(c1!=null){
            prev.next=c1;
        }else{
            prev.next=c2;
        }
        return d.next;
        
    }
}