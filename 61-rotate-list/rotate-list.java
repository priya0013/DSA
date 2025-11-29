class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        tail.next = head;
        k = k % len;
        if (k == 0) {
            tail.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (k-- > 0) {
            fast = fast.next;
        }
        while (fast.next != head) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;

        return newHead;
    }
}
