package tree.deleteNode;

import linkedList.merge.ListNode;

public class Solution {


    public ListNode deleteNode(ListNode head, int val) {
        if (head==null) return null;

        if (head.val==val) return head.next;

        ListNode p=head;
        ListNode q=head.next;

        while (q!=null){
            if (q.val==val){  // 找到要删除的节点了
                p.next=q.next;
                break;
            }else {
                p=q;
                q=q.next;
            }
        }

        return head;
    }

}
