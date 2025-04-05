package src.Linkedlist;

class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int count = 0;
        while (node != null && count < k) {
            node = node.next;
            count++;
        }
        if (count == k) {
            ListNode reversed = reverseKGroup(node, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = reversed;
                reversed = head;
                head = temp;
            }
            return reversed;
        }
        return head;
    }

    public static void main(String[] args) {
        LeetCode25 obj = new LeetCode25();
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = obj.reverseKGroup(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
