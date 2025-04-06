package src.Linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode rev = obj.reverseList(head);
        while (rev != null) {
            System.out.print(rev.val + " ");
            rev = rev.next;
        }
    }
}
