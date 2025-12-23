package GeeksForGeeks.LinkedList.Easy;

public class DeleteAlternativeNode {

    public static void deleteAlt(Node head) {
        Node curr = head;
        while(curr!=null && curr.next!=null){
            curr.next = curr.next.next;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node.traversal(head);
    }
}
