package GeeksForGeeks.LinkedList.Basic;

public class IdenticalLinkedList {

    public static boolean areIdentical(Node head1, Node head2) {
        // code here
        int c1 = 0;
        int c2 = 0;
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null) {
            c1++;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            c2++;
            curr2 = curr2.next;
        }
        if (c1 != c2) {
            return false;
        } else {
            curr1 = head1;
            curr2 = head2;
            while (curr1 != null) {
                if (curr1.data != curr2.data) {
                    return false;
                } else {
                    curr1 = curr1.next;
                    curr2 = curr2.next;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(40);

        System.out.print("LL1 Looks like this : ");
        Node.traversal(head1);
        System.out.print("\nLL2 Looks like this : ");
        Node.traversal(head2);

        System.out.println("\nAre two linked list Identical : "+areIdentical(head1,head2));    // false
    }
}
