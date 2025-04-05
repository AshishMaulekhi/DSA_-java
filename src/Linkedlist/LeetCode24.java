package src.Linkedlist;

class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        LeetCode24 obj = new LeetCode24();
        ListNode head = new ListNode(1); head.next = new ListNode(2); head.next.next = new ListNode(3); head.next.next.next = new ListNode(4);
        ListNode result = obj.swapPairs(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

