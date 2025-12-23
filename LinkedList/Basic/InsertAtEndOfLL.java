package GeeksForGeeks.LinkedList.Basic;

public class InsertAtEndOfLL {

    public static Node insertAtEnd(Node head, int x) {
        // code here

        Node temp = new Node(x);
        if(head == null){
            head=temp;
            return head;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next=temp;


        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);

        head=insertAtEnd(head,50);
        Node.traversal(head);    // 10 20 30 50
    }
}
