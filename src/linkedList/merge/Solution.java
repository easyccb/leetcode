package linkedList.merge;

/**
 * 合并两个链表
 */
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);

        ListNode p=head;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                p.next=list1;
                p=p.next;
                list1=list1.next;

            } else {
                p.next=list2;
                p=p.next;
                list2=list2.next;
            }
        }

        if (list1==null) p.next=list2;
        if (list2==null) p.next=list1;

        return head.next;
    }
}