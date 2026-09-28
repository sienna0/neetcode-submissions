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
    public ListNode helper(ListNode head, int n, int size) {
        if (head == null) return null;
        if (n == size) {
            head = head.next;
            return head;
        }
        head.next = helper(head.next, n, size - 1);
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        return helper(head, n, size);
        
    }
}
