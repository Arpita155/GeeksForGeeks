package GeeksForGeeks.LinkedList.DoublyLinkedList.Easy;

public class ReverseDLL {

    public static Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node temp = null;
        while(curr!=null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node p1 =new Node(20);
        Node p2=new Node(30);
        Node p3=new Node(40);
        p1.prev=head;
        head.next=p1;
        p2.prev=p1;
        p1.next=p2;
        p3.prev=p2;
        p2.next=p3;


        System.out.print("Original DLL : ");
        Node.traversal(head);

        head = reverse(head);

        System.out.print("\nAfter reversing DLL : ");   // After reversing DLL : 40 30 20 10
        Node.traversal(head);
    }
}
