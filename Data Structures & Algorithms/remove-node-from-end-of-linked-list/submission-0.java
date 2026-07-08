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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lis=head;//4-2=2
        //1 2 3 4 5 6 7 8   n=4
        //1 2 3 4   6 7 8
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count=0;
        while(lis!=null){
            count+=1;
            lis=lis.next;
        }
        ListNode temp=dummy;
        if(count<n) return temp;
        for(int i=0;i<count-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return dummy.next;


    }
}
