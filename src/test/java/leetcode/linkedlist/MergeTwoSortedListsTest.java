package leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void test1() {
        // given
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // when
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        // then
        int[] expectValues = {1, 1, 2, 3, 4, 4};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

    @Test
    void test2() {
        // given
        ListNode list1 = null;
        ListNode list2 = null;

        // when
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        // then
        int[] expectValues = {};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

    @Test
    void test3() {
        // given
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        // when
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        // then
        int[] expectValues = {0};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

    @Test
    void test4() {
        // given
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // when
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        // then
        int[] expectValues = {1, 1, 2, 3, 4, 4};
        for (int i : expectValues) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

}