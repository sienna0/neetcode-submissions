class Solution {
    class Node {
        int val;
        int idx;
        Node next;
        public Node (int val, int idx) {
            this.val = val;
            this.idx = idx;
            this.next = null;
        }
    }
    public int findDuplicate(int[] nums) {
        Node firstNode = new Node(nums[0], 0);
        Node curr = firstNode;
        for (int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i], i);
            curr.next = newNode;
            curr = newNode;
        }
        curr.next = firstNode;
        Node slow = curr;
        Node fast = curr;
        while (slow.val != fast.val || slow.idx == fast.idx) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.idx == fast.idx) fast = fast.next;
        }
        return slow.val;
    }
}
