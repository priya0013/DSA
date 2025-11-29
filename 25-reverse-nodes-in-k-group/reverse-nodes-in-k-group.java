
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        int cnt=0;
        while(cur!=null && cnt<k){
            cur=cur.next;
            cnt++;
        }
        if(cnt<k)return head;
        ListNode pre=null;
        cur=head;
        cnt=0;
        while(cur!=null && cnt<k){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
            cnt++;
        }
        head.next=reverseKGroup(cur,k);
    return pre;
    }
}