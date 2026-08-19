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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
         k = k % n;

        if (k == 0) {
            return head;
        }
        Queue<Integer> q=new LinkedList<>();
        int i=0;
        while(i<n-k){
            q.offer(head.val);
            head=head.next;
            i++;
        }
        ListNode temp1=head;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        while(!q.isEmpty()){
            temp1.next=new ListNode(q.poll());
            temp1=temp1.next;
        }
        return head;
    }
}