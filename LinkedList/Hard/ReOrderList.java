package GeeksForGeeks.LinkedList.Hard;

public class ReOrderList {

    public static void reorderlist(Node head) {
        // Your code here
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Node prev = null, curr = slow.next;
        slow.next = null; // Break the list into two halves
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Merge the two halves alternately
        Node first = head, second = prev;
        while (second != null) {
            Node tmp1 = first.next;
            Node tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before Rearranging : ");
        Node.traversal(head);

        reorderlist(head);

        System.out.print("\nAfter Rearranging : ");
        Node.traversal(head);
    }
}
