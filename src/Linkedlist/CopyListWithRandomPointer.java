package src.Linkedlist;

class Node {
    int val;
    Node next, random;
    Node(int x) { val = x; }
    Node(int x, Node next) { val = x; this.next = next; }
}

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        curr = head;
        Node newHead = head.next;
        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            if (copy.next != null)
                copy.next = copy.next.next;
            curr = curr.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);
        CopyListWithRandomPointer obj = new CopyListWithRandomPointer();
        Node res = obj.copyRandomList(head);
    }
}