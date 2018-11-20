package linklist;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 **/
public class HasCycle {
    /**
     * 如果有环，依次访问链表节点时肯定会重复访问，因为没有结尾为null的尾标识
     * 把访问到的链表元素依次加入到HashSet中去。通过判断是否有重复节点来判断是否重复遍历，即：是否有环存在
     * 时间复杂度：访问n个节点，为n.判断是否存在时时间复杂度为0（1）.所以为O(n)
     * 空间复杂度：存储n个节点，为O(n)
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while (head != null) {
            if (set.contains(head))
                return true;
            else
                set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 如果不额外使用存储空间来存储节点判断是否存在，那么怎么判断节点是否出现过呢？
     * 考虑使用时间维度来替换空间维度。
     * 想象两个人，一个跑的快，一个跑的慢，如果二者在直线上百米赛跑，那么快的人肯定先到达终点！如果二者在操场环形赛道上跑步，不设置终点（即没有null位），那么不管二者的位置是怎么样的，快的一定会追上慢的。
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;//快的一次跑两步，所以让快的先走一步，避免/2时在直线上跑 快的没有找到null值
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
