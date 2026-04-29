package GeeksForGeeks.LinkedList.Easy;

public class DeleteNodesHavingGreaterValueOnRight {

    public static Node compute(Node head) {
        // your code here

        if (head == null || head.next == null) {
            return head;
        }

        // 1. Reverse the list
        head = reverse(head);

        // 2. Traverse and remove nodes smaller than max seen so far
        Node curr = head;
        int maxVal = curr.data;

        while (curr != null && curr.next != null) {
            if (curr.next.data < maxVal) {
                // Skip the next node
                curr.next = curr.next.next;
            } else {
                // Update maxVal and move forward
                maxVal = curr.next.data;
                curr = curr.next;
            }
        }

        // 3. Reverse back
        return reverse(head);
    }

    // Helper function to reverse a linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);


        System.out.print("LL looks like this : ");
        Node.traversal(head);  // LL looks like this : 12 15 10 11 5 6

        System.out.print("\nAfter deletion LL looks like this : ");
        Node.traversal(compute(head));     // After deletion LL looks like this :15 11 6
    }
}
