package homework9;

public class Bai206 {
    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prevNode;
            prevNode = head;
            head = next;
        }
        return prevNode;
    }

    public static ListNode printAllNode(ListNode head) {
        ListNode iNode = head;
        while (iNode != null) {
            System.out.print("\t" + iNode);
            iNode = iNode.next;
        }
        System.out.println();
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        printAllNode(n1);
        printAllNode(reverseList(n1));

    }
}
