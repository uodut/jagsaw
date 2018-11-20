package linklist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void addNode(ListNode newNode) {
        if (this.next == null) {
            this.next = newNode;
        } else {
            //往后找，插在最后面
            this.next.addNode(newNode);
        }
    }

}
