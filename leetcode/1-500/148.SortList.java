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
    public ListNode sortList(ListNode head) {
        if(head!=null && head.next!=null){
            ListNode curr = head;
            while(curr.next!=null){
                ListNode s = replaceSmallest(curr);
                int val = curr.val;
                curr.val = s.val;
                s.val = val;
                curr = curr.next;
            }
        }
        return head;
    }
    public ListNode replaceSmallest(ListNode curr){
        //System.out.println("Current curr="+curr.val);
        ListNode s = curr;
        while(curr.next!=null){
            if(s.val>=curr.next.val){
                s = curr.next;
            }     
            curr = curr.next;
        }
        //System.out.println("Smallest s="+s.val);
        return s;
    }
}