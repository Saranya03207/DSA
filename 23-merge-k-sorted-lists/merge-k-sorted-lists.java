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
    public ListNode mergeKLists(ListNode[] lists) {
     ArrayList<Integer> l=new ArrayList<>();

     for(ListNode head:lists){
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
     }
     Collections.sort(l);

     ListNode dummy=new ListNode(0);
     ListNode tail=dummy;

     for(int i:l){
        tail.next=new ListNode(i);
        tail=tail.next;
     }
     return dummy.next;
    }
}