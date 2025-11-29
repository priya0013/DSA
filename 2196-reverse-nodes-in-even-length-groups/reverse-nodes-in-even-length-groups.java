class Solution {
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode cur = head;
        int groupSize = 1;
        ListNode prevGroupEnd = null;

        while (cur != null) {

            int count = 0;
            ListNode groupStart = cur;

            while (cur != null && count < groupSize) {
                cur = cur.next;
                count++;
            }

            if (count % 2 == 0) {
                ListNode nextGroupStart = cur;

                ListNode temp = groupStart;
                for (int i = 1; i < count; i++) temp = temp.next;
                temp.next = null;

                ListNode revHead = reverse(groupStart);

                if (prevGroupEnd != null) {
                    prevGroupEnd.next = revHead;
                } else {
                    head = revHead;
                }

                groupStart.next = nextGroupStart;
                prevGroupEnd = groupStart;

            } else {
                if (prevGroupEnd != null)
                    prevGroupEnd.next = groupStart;

                ListNode temp = groupStart;
                for (int i = 1; i < count; i++) temp = temp.next;

                prevGroupEnd = temp;
            }

            groupSize++;
        }

        return head;
    }
}
