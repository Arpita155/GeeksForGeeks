package GeeksForGeeks.LinkedList.Medium;

public class DeleteWithoutHeadPointer {

    public static void deleteNode(Node del) {
        // code here
        if(del==null||del.next==null)
            return;
        del.data=del.next.data;
        del.next=del.next.next;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before deletion : ");
        Node.traversal(head);

        deleteNode(head.next);

        System.out.print("\nAfter deletion : ");
        Node.traversal(head);
    }
}
