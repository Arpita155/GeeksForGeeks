package GeeksForGeeks.LinkedList.DoublyLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int value){
        this.data=value;
        this.next=null;
        this.prev=null;
    }

    public static void traversal(Node head) {

        // -----------Iterative Traversal--------
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
