/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            map.put(curr, newNode);
            curr = curr.next;
        }

        Node curr2 = head;
        while(curr2.next != null) {
            Node newNode = map.get(curr2);
            newNode.next = map.get(curr2.next);
            newNode.random = map.get(curr2.random);
            curr2 = curr2.next;
        }
        Node newNode = map.get(curr2);
        newNode.random = map.get(curr2.random);
        
        return map.get(head);
    }
}
