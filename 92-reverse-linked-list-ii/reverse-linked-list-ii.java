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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode cur=head;
        ListNode pre=null;
        for(int i=1;i<left;i++){
            pre=cur;
            cur=cur.next;
        }
        ListNode first=cur;
        ListNode last=pre;
        for(int k=0;k<(right-left+1);k++){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        if(last!=null){
            last.next=pre;
        }else{
            head=pre;
        }
        first.next=cur;
        return head;
    }
}