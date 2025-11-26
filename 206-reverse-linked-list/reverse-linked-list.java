

 ////////BRUTE FORCE APPROACH//////////
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