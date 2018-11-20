package linklist;

/**
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * 遍历或递归反转
 **/
public class ReverseList {

    /**
     * 1->2->3->4->5->NULL
     * 可以想成变成下面这种形式的
     * 1<-2<-3<-4<-5
     *
     * 因为ListNode没有向前的指针。所以需要存储
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmp;
        }
        return prev;
    }
}
