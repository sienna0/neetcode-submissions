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
    public void reorderList(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();

        ListNode curr = head;

        int currNum = 0;
        while (curr != null) {
            map.put(currNum, curr);
            curr = curr.next;
            currNum++;
        }

        ListNode curr2 = head;
        int left = 0;
        int right = currNum - 1;
        for (int i = 0; i < currNum; i++) {
            if (i % 2 == 0) {
                curr2.next = map.get(left);
                left++;
            } else {
                curr2.next = map.get(right);
                right--;
            }
            curr2 = curr2.next;
        }

        curr2.next = null;
        
    }
}
