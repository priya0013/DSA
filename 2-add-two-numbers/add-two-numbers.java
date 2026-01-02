class Solution {
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1 = reverse(l1);
        l2 = reverse(l2);

        List<Integer> la = new ArrayList<>();
        List<Integer> lb = new ArrayList<>();

        while(l1 != null){
            la.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            lb.add(l2.val);
            l2 = l2.next;
        }

        List<Integer> sum = new ArrayList<>();

        int i = la.size() - 1;   // start from END
        int j = lb.size() - 1;   // start from END
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int a = (i >= 0) ? la.get(i) : 0;
            int b = (j >= 0) ? lb.get(j) : 0;   // FIXED

            int s = a + b + carry;
            carry = s / 10;
            sum.add(s % 10);

            i--;
            j--;
        }

        // Build linked list from sum list (which is in correct order)
        ListNode head = null;
        for(int k = 0; k < sum.size(); k++){
            head = new ListNode(sum.get(k), head);
        }

        return reverse(head); // NO reverse needed; sum is already reverse-order digits
    }
}
