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
    public ListNode reverseList(ListNode head){
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
            int cnt=1;
            ListNode cur=head,pre=null;
            ListNode start=head;
            while(cur!=null && cnt<right){
                if(cnt<left){
                    pre=cur;
                }
                if(cnt==left){
                    start=cur;
                }
                cur=cur.next;
                cnt++;
            }
            ListNode temp=cur.next;
            cur.next=null;
            ListNode rev=reverseList(start);
            if(pre!=null){
                pre.next=rev;
                
            }else{
                head=rev;
            }
           
        
        start.next=temp;
        return head;
    }
}