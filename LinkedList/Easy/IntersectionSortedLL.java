package GeeksForGeeks.LinkedList.Easy;

public class IntersectionSortedLL {

    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node head = new Node(0);
        Node curr1 = head1;
        Node curr2 = head2;
        Node curr = head;
        while(curr1!=null && curr2!=null){
            if(curr1.data < curr2.data){
                curr1=curr1.next;
            }else if(curr2.data < curr1.data){
                curr2=curr2.next;
            }else{
                curr.next = new Node(curr1.data);
                curr = curr.next;

                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }


        return head.next;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(10);
        head2.next.next.next = new Node(40);

        System.out.print("LL1 : ");
        Node.traversal(head1);
        System.out.print("\nLL2 : ");
        Node.traversal(head2);

        Node head = findIntersection(head1,head2);
        System.out.print("\nNew LL After intersection : ");
        Node.traversal(head);
    }
}
