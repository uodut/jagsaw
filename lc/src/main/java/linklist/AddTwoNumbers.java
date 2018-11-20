package linklist;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //给链表初始化一个值，然后在返回的时候从1开始。如果不这样做，需要在插入链表的时候判断是否是第一次插入的操作。
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        // ||判断过滤两个链表不一样长的情况
        while (p != null || q != null) {
            //因为是加操作，所以如果是空的话可以用0填充
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            //进位 /10操作 结果取余操作
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        //最后一位如果是进位，把最后一位列在最后
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
