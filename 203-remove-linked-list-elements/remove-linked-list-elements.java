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
    public ListNode removeElements(ListNode head, int val) {
       ListNode pre=null;
       ListNode cur=head;
       while(cur!=null){
            if(cur.val==val){
           
                if(pre==null){
                    head=cur.next;
                }else{
                    pre.next=cur.next;
                }
                cur=cur.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
       
       return head;
    }
}