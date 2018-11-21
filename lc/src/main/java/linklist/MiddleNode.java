package linklist;

/**
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * <p>
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 **/
public class MiddleNode {

    /**
     * 链表的缺点是不能根据下标遍历，那么就依赖数组的特点。把每个节点都放到数组里面。使用数组的下表取中间值
     * <p>
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public ListNode middleNode1(ListNode head) {
        ListNode[] nodeArr = new ListNode[100];
        int index = 0;
        while (head.next != null) {
            nodeArr[index++] = head;
            head = head.next;
        }
        int mid = index % 2 == 0 ? index / 2 : index / 2 + 1;
        return nodeArr[mid];
    }

    /**
     * 快指针一次走二步，慢指针一次走一步。这样快指针走完的时候，满指针走了一半。
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
