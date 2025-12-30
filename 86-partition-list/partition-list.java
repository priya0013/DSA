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
    public ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(0);
        ListNode great=new ListNode(0);
        ListNode lessN=less;
        ListNode greatN=great;
        while(head!=null){
            if(head.val<x){
                lessN.next=head;
                lessN=lessN.next;
            }else{
                greatN.next=head;
                greatN=greatN.next;
            }
            head=head.next;
        }
        greatN.next=null;
        lessN.next=great.next;
        return less.next;
    }
}