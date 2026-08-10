/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode e=head;
        if(head==null){
            return null;
        }
        while(e.next!=null && e.next.next!=null){
            s=s.next;
            e=e.next.next;
            if(e==s){
                ListNode p1=head;
        ListNode p2=e;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;

            }
        }
       return null;
    }
}