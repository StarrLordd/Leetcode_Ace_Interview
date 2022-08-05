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
    public ListNode merge(ListNode left, ListNode right){
         if(right == null) return left;
         if (left == null) return right;
         
         ListNode sorted_list = new ListNode(0,null);
         ListNode current = sorted_list;
         
         while(left!=null&&right!=null){
             if(left.val < right.val)
             {
                 current.next = left;
                 left = left.next;
             }
             else{
                 current.next = right;
                 right = right.next;
             }
             current = current.next;
         }
         if(left!=null){
             while(left!=null){
                 current.next = left;
                 left = left.next;
                 current = current.next;
             }
         }
         if(right!=null){
             while(right!=null){
                 current.next = right; 
                 right = right.next;
                 current = current.next;
             }
         }             
    
     return sorted_list.next;         
     }
     public ListNode sortList(ListNode head) {
         if(head ==null || head.next ==null) return head;
         
         ListNode mid = head;
         ListNode slow = head;
         ListNode fast = head;
         
         while(fast!=null && fast.next!=null){
             mid = slow;
             slow = slow.next;
             fast = fast.next.next;
         }
     
         mid.next = null; // first half
         
         ListNode left = sortList(head);
         ListNode right = sortList(slow);
         return merge(left,right);
    }
}