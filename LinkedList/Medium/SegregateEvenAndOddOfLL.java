package GeeksForGeeks.LinkedList.Medium;

public class SegregateEvenAndOddOfLL {

    public static Node divide(Node head) {
        // code here
        Node curr = head;
        Node temp = new Node(0);
        Node head1 = temp;
        while(curr != null){
            if(curr.data%2==0){
                head1.next = new Node(curr.data);

                head1=head1.next;
            }
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            if(curr.data%2!=0){
                head1.next = new Node(curr.data);
                head1=head1.next;
            }
            curr = curr.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("LL looks like this : ");
        Node.traversal(head);

        head = divide(head);

        System.out.print("\nAfter segregation : ");
        Node.traversal(head);
    }
}
