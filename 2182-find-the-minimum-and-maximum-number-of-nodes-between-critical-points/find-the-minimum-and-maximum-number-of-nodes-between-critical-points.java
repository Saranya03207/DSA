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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode dummy=head;
        int n=0;
        while(dummy!=null){
            n++;
            dummy=dummy.next;
        }

        if(n<=2){
            return new int[]{-1,-1};
        }

        dummy=head;
        int i=1;
        
        ListNode prev=head;
        ListNode curr=head.next;
         int minD=Integer.MAX_VALUE;
        int maxD=-1;

        int f= -1;
        int prevC=-1;

        while(curr!=null && curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
               if(f==-1){
                f=i;
               }
               if(prevC!=-1){
                int dis=i-prevC;
                minD=Math.min(dis,minD);
                maxD=i-f;
               }
               prevC=i;
            }
            prev=curr;
            curr=curr.next;
            i++;
        }
       
        if(f==-1 || f==prevC){
            return new int[]{-1,-1};
        }
        return new int[]{minD,maxD};
    }
}