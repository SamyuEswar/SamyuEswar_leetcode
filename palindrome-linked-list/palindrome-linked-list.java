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
    public ListNode reverse(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode new_head=slow.next;
        slow.next=null;
        ListNode reversed_head=reverse(new_head);
        ListNode lo=head,hi=reversed_head;
        while(hi!=null){
            if(lo.val!=hi.val) return false;
            lo=lo.next;
            hi=hi.next;
        }
        return true;
    }
}