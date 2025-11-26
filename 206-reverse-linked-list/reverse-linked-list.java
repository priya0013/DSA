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
    public ListNode reverseList(ListNode head) {
        ListNode newhead=null;
        ListNode newtail=null;
        ListNode cur,pre;
        while(head!=null){
            pre=null;
            cur=head;
            while(cur.next!=null){
                pre=cur;
                cur=cur.next;
            }
            if(pre!=null){
                pre.next=cur.next;

            }else{
                head=cur.next;
            }
            if(newhead==null){
                newhead=newtail=cur;
            }else{
                newtail=newtail.next=cur;
            }

        }
        return newhead;
    }
}