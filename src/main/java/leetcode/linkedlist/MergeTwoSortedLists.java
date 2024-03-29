package leetcode.linkedlist;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultHead = new ListNode();
        ListNode point = resultHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                point.next = list1;
                list1 = list1.next;
            } else  {
                point.next = list2;
                list2 = list2.next;
            }

            point = point.next;
        }

        point.next = list1 != null ? list1 : list2;
        return resultHead.next;
    }

}
