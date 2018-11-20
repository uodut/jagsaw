package linklist;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 **/
public class MergeTwoList {

    /**
     * 要理解ListNode这种递归结果的含义：
     * 链表L：1->2->3->4->5
     * 则：
     * L表示第一个节点，包含val=1以及指向2的指针；
     * L.next表示第二个节点，包含val=2以及指向2的指针；
     * <p>
     * 在链表中，= 理解为指向。例如下面的代码：
     * head = new ListNode(0): 表示head指向0。
     * m = head;表示变量m 指向head.也即指向0
     * m.next = l1;表示m的下一个节点指向l1的head节点。
     * m=m.next;表示m指针向后移动一个
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode m = head;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    m.next = l1;
                    l1 = l1.next;
                } else {
                    m.next = l2;
                    l2 = l2.next;
                }
                m = m.next;
            } else if (l1 == null) {
                m.next = l2;
                break;
            } else {
                m.next = l1;
                break;
            }
        }
        return head.next;
    }
}
