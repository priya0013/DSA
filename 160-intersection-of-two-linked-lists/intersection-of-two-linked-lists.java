/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        ListNode temp=headA;
        while(temp!=null){
            s1.push(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            s2.push(temp);
            temp=temp.next;
        }
        ListNode inter=null;
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.peek()==s2.peek()){
                inter=s1.pop();
                s2.pop();
            }else{
                break;
            }
        }
        return inter;
    }
}