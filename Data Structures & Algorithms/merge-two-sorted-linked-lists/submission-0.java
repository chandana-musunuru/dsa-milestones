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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode dummy = new ListNode();
        ListNode newNo=dummy;
        while(list1!=null && list2!=null){
            if(list1.val==list2.val){
                newNo.next=list1;
                list1=list1.next;
                newNo=newNo.next;
               
                newNo.next=list2;
                list2=list2.next;
                newNo=newNo.next;
            }
            else if(list1.val>list2.val){
                newNo.next=list2;
                list2=list2.next;
                newNo=newNo.next;
            }
            else{
                newNo.next=list1;
                list1=list1.next;
                newNo=newNo.next;
            }
        }
        if(list1!=null){
            newNo.next=list1;
        }
        if(list2!=null){
            newNo.next=list2;
        }
        return dummy.next;
    }
}