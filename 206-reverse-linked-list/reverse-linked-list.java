import java.util.Stack;
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
        if(head==null){
            return null;
        }
        Stack<ListNode> s=new Stack<>();
        ListNode cur=head;
        while(cur!=null){
            s.push(cur);
            cur=cur.next;
        }
        ListNode newhead=s.pop();
        ListNode tail=newhead;
        while(!s.isEmpty()){
            ListNode node=s.pop();
            tail.next=node;
            tail=node;
        }
        tail.next=null;
        return newhead;
        

    }
}