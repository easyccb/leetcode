package linkedList.reverseList;

/**
 * 翻转链表
 */

import java.util.Stack;

public class Solution {

    public static ListNode ReverseList(ListNode head) {
        if(head==null) return null;

        Stack<ListNode> stack= new Stack<>();
        ListNode p=head;

        while(p!=null){
            stack.push(p);
            p=p.next;
        }

        head= stack.pop();
        p=head;

        while(!stack.isEmpty()){
            p.next=stack.pop();
            p=p.next;
        }
        p.next=null;

        return head;
    }

    public static void main(String[] args) {


    }
}
