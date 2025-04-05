package src.Linkedlist;

class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode oldTail = head;
        int len = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            len++;
        }
        oldTail.next = head;
        int steps = len - k % len;
        ListNode newTail = head;
        for (int i = 1; i < steps; i++) newTail = newTail.next;
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LeetCode61 obj = new LeetCode61();
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = obj.rotateRight(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

