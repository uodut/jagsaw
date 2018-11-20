package linklist;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 * <p>
 **/
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        ListNode point = new ListNode(0);
        point.next = head;
        ListNode ret = point;
        int index = 0;
        while (point != null) {
            if (index == length - n) {
                if (point.next != null) {
                    point.next = point.next.next;
                } else {
                    point.next = null;
                }
                break;
            } else {
                point = point.next;
            }
            index++;
        }
        return ret.next;
    }

    /**
     * 只遍历一次的方式：
     * 假设一个列表长度为6，从后数倒数第2个节点，也就是从头数正数第5个节点。
     * 那么一个从头开始的节点走几步能走到倒数第n个节点的位置呢？
     * 如果总长度为L:则为L+1-N
     * 现在不知道总长度，
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        return null;
    }
}
