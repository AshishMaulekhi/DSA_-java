package src.Linkedlist;

import java.util.*;

class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode node : lists) if (node != null) pq.add(node);
        ListNode dummy = new ListNode(0), current = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;
            if (node.next != null) pq.add(node.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LeetCode23 obj = new LeetCode23();
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1); lists[0].next = new ListNode(4); lists[0].next.next = new ListNode(5);
        lists[1] = new ListNode(1); lists[1].next = new ListNode(3); lists[1].next.next = new ListNode(4);
        lists[2] = new ListNode(2); lists[2].next = new ListNode(6);
        ListNode result = obj.mergeKLists(lists);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
