package leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @Test
    void test1() {
        // given
        ListNode head = new ListNode(1, new ListNode(2));

        // when
        ListNode result = new ReverseLinkedList().reverseList(head);

        // then
        int[] expectValues = {2, 1};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

    @Test
    void test2() {
        // given
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        // when
        ListNode result = new ReverseLinkedList().reverseList(head);

        // then
        int[] expectValues = {5, 4, 3, 2, 1};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

    @Test
    void test3() {
        // given
        ListNode head = new ListNode();

        // when
        ListNode result = new ReverseLinkedList().reverseList(head);

        // then
        int[] expectValues = {};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

}