class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        boolean carry_one = false;
        ListNode prev = null;

        while (curr1 != null || curr2 != null) {
            int sum = 0;
            
            if (curr1 != null) sum += curr1.val;
            if (curr2 != null) sum += curr2.val;
            if (carry_one) sum++;
            
            if (curr1 != null) {
                curr1.val = sum % 10;
                carry_one = sum >= 10;
                prev = curr1;
                curr1 = curr1.next;
            } else {
                prev.next = new ListNode(sum % 10);
                prev = prev.next;
                carry_one = sum >= 10;
            }

            if (curr2 != null) curr2 = curr2.next;
        }

        if (carry_one) {
            prev.next = new ListNode(1);
        }

        return l1;
    }
}
