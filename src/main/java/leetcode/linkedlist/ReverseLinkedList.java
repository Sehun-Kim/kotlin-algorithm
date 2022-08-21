package leetcode.linkedlist;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode before, ListNode current) {
        if (current == null)
            return before;

        ListNode next = current.next;
        current.next = before;
        return reverse(current, next);
    }

}
