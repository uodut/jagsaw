package linklist;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * @author gl
 * @create 2018-08-13 17:36
 **/
public class MergeKLists {
    public ListNode mergeKLists1(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });

        ListNode head = new ListNode(0);
        ListNode p = head;

        for (ListNode list : lists) {
            if (list != null)
                queue.offer(list);
        }

        while (!queue.isEmpty()) {
            ListNode n = queue.poll();
            p.next = n;
            p = p.next;

            if (n.next != null)
                queue.offer(n.next);
        }

        return head.next;
    }

    public ListNode mergeKList2(ListNode[] lists, int left, int right) {
        ListNode n1, n2;
        if (right - left > 1) {
            n1 = mergeKList2(lists, left, left + (right - left) / 2);
            n2 = mergeKList2(lists, left + (right - left) / 2 + 1, right);
        } else if (right - left == 0) {
            n1 = null;
            n2 = lists[right];
        } else {
            n1 = lists[left];
            n2 = lists[right];
        }
        ListNode ans = merge2List(n1, n2);
        return ans;
    }

    public ListNode merge2List(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null) curr.next = l2;
        if (l2 == null) curr.next = l1;
        return head.next;
    }

}
