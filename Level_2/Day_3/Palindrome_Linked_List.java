///Array Approach.........
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int i=0,j=arr.size()-1;
        while(i<=j){
            if(arr.get(i)!=arr.get(j)) return false;
            i++;j--;
        }
        return true;
    }
}


//Reverse List Approach.....................

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        
        ListNode revHead=reverseNode(temp);
        
        while(head!=null && revHead!=null){
            if(head.val!=revHead.val) return false;
            head=head.next;
            revHead=revHead.next;
        }
        return true;
        
    }
    
    ListNode reverseNode(ListNode head){
        if(head==null) return head;
        
        ListNode prev=null;
        ListNode cur=head;
        
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}