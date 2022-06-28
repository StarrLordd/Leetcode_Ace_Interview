class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count/2;
        int c=0;
        temp=head;
        ListNode newNode=new ListNode();
        while(temp!=null){
            c++;
            if(c>count){
                newNode=temp;
                break;
            }
            temp=temp.next;
        }
        return newNode;
    }
}